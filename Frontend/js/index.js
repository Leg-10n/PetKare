function scrollToSection(sectionId) {
    document.getElementById(sectionId).scrollIntoView({ behavior: 'smooth' });
}

function loadPets() {
    const pets = [
        { name: 'Esme and Ralda', type: 'Cats', image: 'images/cat1.jpg' },
        { name: 'Layla', type: 'Dog', image: 'images/dog1.jpg' },
        { name: 'Brown', type: 'Dog', image: 'images/dog2.jpg' },
        { name: 'Roy', type: 'Dog', image: 'images/dog3.jpg' },
        { name: 'Kristen', type: 'Cat', image: 'images/cat2.jpg' },
        { name: 'Jack and Daniel', type: 'Dogs', image: 'images/dog4.jpg' },
    ];

    const petGallery = document.querySelector('.pet-gallery');
    pets.forEach(pet => {
        const petCard = document.createElement('div');
        petCard.className = 'pet-card';
        petCard.innerHTML = `
            <img src="${pet.image}" alt="${pet.name}" style="width:100%">
            <h3>${pet.name}</h3>
            <p>${pet.type}</p>
        `;
        petGallery.appendChild(petCard);
    });
}

document.addEventListener('DOMContentLoaded', loadPets);
