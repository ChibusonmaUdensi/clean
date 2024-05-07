const cars = [7, 4, 2, 3, 4];

let maximum = cars[0];
let minimum = cars[1];
for (let i = 0; i < cars.length; i++) {
	if (cars[i] > maximum) {
	maximum = cars[i];
	}

	if (cars[i] < minimum) {
	minimum = cars[i];
	}

}
range = (maximum - minimum)
console.log(range)




const seeds = [9, 2, 1, 8, 6];

let maximum1 = cars[0];
let minimum2 = cars[1];
for (let i = 0; i < cars.length; i++) {
	if (seeds[i] > maximum1) {
	maximum1 = seeds[i];
	}

	if (seeds[i] < minimum2) {
	minimum2 = seeds[i];
	}

}
range = (maximum - minimum)
range = (maximum1 - minimum2)

console.log(range)


