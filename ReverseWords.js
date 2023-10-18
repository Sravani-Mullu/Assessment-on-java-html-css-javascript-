function reverseWord(w)
{
	var r="";
	for(let i=w.length-1 ; i>=0 ; i--){
		r = r+w[i]
	}
 	return r;
}

function reverseWords(s){
	const words = s.split(' ');
	var result="";
	for(let i=0 ; i<words.length; i++){
		result = result+reverseWord(words[i]);
		if(i< words.length-1){
		    result +=" ";
		}
	}
	return result;
}

const res = "This is a sunny day";
console.log(res);