document.addEventListener("DOMContentLoaded", async () => {
    const petContainer = document.getElementById("pet-container");

    try {
        // Fetch pet data from the backend
        const response = await fetch("http://localhost:8089/api/pets");
        const pets = await response.json();

        // Create pet cards dynamically
        pets.forEach((pet) => {
            const petCard = document.createElement("div");
            petCard.classList.add("pet-card");

            petCard.innerHTML = `
                <img src="${pet.petImage}" alt="${pet.name}" class="pet-image">
                <h3>${pet.name}</h3>
                <p>${pet.description}</p>
            `;

            petContainer.appendChild(petCard);
        });
    } catch (error) {
        console.error("Error fetching pets:", error);
    }
});
