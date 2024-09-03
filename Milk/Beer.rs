fn main() {
    let mut bottles = 99;

    while bottles > 0 {
        println!(
            "{} bottle{} of beer on the wall, {} bottle{} of beer.",
            bottles,
            if bottles == 1 { "" } else { "s" },
            bottles,
            if bottles == 1 { "" } else { "s" }
        );
        bottles -= 1;
        println!(
            "Take one down and pass it around, {} bottle{} of beer on the wall.\n",
            if bottles == 0 { "no more".to_string() } else { bottles.to_string() },
            if bottles == 1 { "" } else { "s" }
        );
    }

    println!("No more bottles of beer on the wall, no more bottles of beer.");
    println!("Go to the store and buy some more, 99 bottles of beer on the wall.");
}