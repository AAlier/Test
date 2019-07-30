package com.example.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(this);
        recyclerView.setAdapter(adapter);
        adapter.update(getSampleImages());
    }

    @Override
    public void onImageClicked(String url) {
        Intent imageDownloadService = new Intent(MainActivity.this, SampleService.class);
        imageDownloadService.putExtra("url", url);
        startService(imageDownloadService);
    }

    private List<String> getSampleImages() {
        List<String> temp = new ArrayList<>();
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.pinimg.com/originals/4d/26/63/4d26639142569afbe67753e4fbfe1f67.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/c5ujx4OeQpY/maxresdefault.jpg");
        temp.add("https://hollywoodactressname.com/wp-content/uploads/2019/01/Jennifer-Lawrence.jpg");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2");
        temp.add("https://qph.fs.quoracdn.net/main-qimg-83e12067e71f22fae87f29bac84fe168");
        temp.add("https://i.pinimg.com/originals/0b/56/01/0b560184b5c42e23d4112297e73710c0.jpg");
        temp.add("https://i.ytimg.com/vi/In7YZNwSPYY/maxresdefault.jpg");
        return temp;
    }

}