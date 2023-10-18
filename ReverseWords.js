function reverseWords(s)
{
	const words = s.split(' ');
	
	const result = words.map( word => {
		return word.split('').reverse().join('');
	});

	const reversed = result.join(' ');

	return reversed;
}

const s = "This is a sunny day";
console.log(reverseWords(s));