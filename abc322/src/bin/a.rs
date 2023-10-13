use num_traits::FromPrimitive as _;
use proconio::{fastout, input};

#[fastout]
fn main() {
    input! {
        _n: usize,
        s: String
    }
    println!("{}", s.find("ABC").and_then(|x| isize::from_usize(x + 1)).unwrap_or(-1));
}
