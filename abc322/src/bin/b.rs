use proconio::{fastout, input};

#[fastout]
fn main() {
    input! {
        _n: u32, _m: u32,
        s: String,
        t: String,
    }

    if t.starts_with(&s) && t.ends_with(&s) {
        println!("0");
    } else if t.starts_with(&s) {
        println!("1");
    } else if t.ends_with(&s) {
        println!("2");
    } else {
        println!("3");
    }
}