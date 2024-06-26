// Generated by view binder compiler. Do not edit!
package com.example.appfood.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appfood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LogInBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnDangNhap;

  @NonNull
  public final TextView txtdangky;

  @NonNull
  public final EditText txtemail;

  @NonNull
  public final EditText txtpassword;

  private LogInBinding(@NonNull FrameLayout rootView, @NonNull Button btnDangNhap,
      @NonNull TextView txtdangky, @NonNull EditText txtemail, @NonNull EditText txtpassword) {
    this.rootView = rootView;
    this.btnDangNhap = btnDangNhap;
    this.txtdangky = txtdangky;
    this.txtemail = txtemail;
    this.txtpassword = txtpassword;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LogInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LogInBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.log_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LogInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDangNhap;
      Button btnDangNhap = ViewBindings.findChildViewById(rootView, id);
      if (btnDangNhap == null) {
        break missingId;
      }

      id = R.id.txtdangky;
      TextView txtdangky = ViewBindings.findChildViewById(rootView, id);
      if (txtdangky == null) {
        break missingId;
      }

      id = R.id.txtemail;
      EditText txtemail = ViewBindings.findChildViewById(rootView, id);
      if (txtemail == null) {
        break missingId;
      }

      id = R.id.txtpassword;
      EditText txtpassword = ViewBindings.findChildViewById(rootView, id);
      if (txtpassword == null) {
        break missingId;
      }

      return new LogInBinding((FrameLayout) rootView, btnDangNhap, txtdangky, txtemail,
          txtpassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
