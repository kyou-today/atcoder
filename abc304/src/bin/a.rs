use proconio::input;

fn main() {
    input! {
        n: usize,
        sa: [(String, u32); n],
    }

    let mut min_index = 0;
    let mut min_age = sa[0].1;

    for i in 0..n {
        if sa[i].1 < min_age {
            min_age = sa[i].1;
            min_index = i;
        }
    }

    for i in 0..n {
        println!("{}", sa[(min_index + i) % n].0)
    }
}
