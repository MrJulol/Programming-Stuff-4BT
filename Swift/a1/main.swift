import Calendar

class car{
    private var Marke: String
    private var Baujahr: Int

    init(Marke: String, Baujahr: Int){
        self.Marke = Marke
        self.Baujahr = Baujahr
    }
    
    public func getMarke() -> String {
        return self.Marke
    }
    
    public func getBaujahr() -> Int {
        return self.Baujahr
    }

    public func setMarke(Marke: String) {
        self.Marke = Marke
    }

    public func setBaujahr(Baujahr: Int)  {
        self.Baujahr = Baujahr
    }

    public func calcAge() -> Int {
        let year = Calendar(identifier: .gregorian).dateComponents([.year], from: Date()).year
        return year-self.Baujahr
    }
}

let car1 = car(Marke: "car1", Baujahr: 2006)

print(car1.calcAge())

