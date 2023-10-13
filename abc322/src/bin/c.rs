use proconio::{input, fastout};

#[fastout]
fn main() {
    input! {
        n: usize, m: usize,
        mut a: [usize; m],
    }
    a.reverse();
    for i in 1..=n {
        if *a.last().unwrap() < i {
            a.pop();
        }
        println!("{}", a.last().unwrap() - i);
    }
}
