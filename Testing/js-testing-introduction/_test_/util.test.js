// const { generateText } = require('../util.js');
// describe('Teste de saída de dados', () => {

//     test('Saída com dados', () => {
//         const text = generateText('Houser', 30);
//         expect(text).toBe('Houser (30 years old)');
//         const text2 = generateText('Digital', 25);
//         expect(text2).toBe('Digital (25 years old)');
//     });

//     it('Saída com dados vazios', () => {
//         const text = generateText('', null);
//         expect(text).toBe(' (null years old)');
//     });

//     test('Saída sem dados', () => {
//         const text = generateText();
//         expect(text).toBe('undefined (undefined years old)');
//     });
// })

// describe('Common matcher', () =>{
//     test('Verificação de texto', ()=>{
//         const text1 = generateText();
//         const text2 = 'undefined (undefined years old)';
//         const text3 = ' (undefined years old)';
//         expect(text1).toEqual(text2);
//         expect(text1).not.toEqual(text3);
//         expect(text1).toMatch(/undefined/);
//         expect(text1).not.toMatch(/null/);
//     })
// })

const { generateText, validateInput, createElement } = require('../util.js');

describe('Testes de saída de dados', () => {
    test('Saída com dados', () =>{
        const text = generateText('Houser',30);
        expect(text).toBe('Houser (30 years old)');
    });
      
    it('Saída com dados vazios', () =>{
        const text = generateText('',null);
        expect(text).toBe(' (null years old)');    
    });
    
    test('Saída sem dados', () =>{
        const text = generateText();
        expect(text).toBe('undefined (undefined years old)');    
    });
})

describe('Validate functions', () => {
    test('Validate Input function text', () =>{
        const text = validateInput('texto');
        expect(text).toBeTruthy;
    });
    test('Validate Input function empty', () =>{
        const ret = validateInput();
        expect(ret).toBeFalsy();
    });
    test('Validate Input function number', () =>{
        const ret = validateInput(null,true,false);
        expect(ret).toBeFalsy();
    });
    test('Validate Input function text empty', () =>{
        const ret = validateInput(" ",true,false);
        expect(ret).toBeFalsy();
    });
    test('Validate Input function text NaN', () =>{
        const ret = validateInput(NaN,false,true);
        expect(ret).toBeFalsy();
    });
})

describe('Validate Create Element', () => {
    test('Create new element with data', () =>{
        const element = createElement('li', "exampleElement", 'user-item');
        expect(element.textContent).toMatch(/exampleElement/);
    });
    test('Create new element without data', () => {
        const element = createElement(null);
        expect(element.textContent).toBe("");
    });
})