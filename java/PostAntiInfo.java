package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PostAntiInfo extends Message {
  public static final String DEFAULT_BLOCK_CANCEL = "";
  
  public static final String DEFAULT_BLOCK_CONFIRM = "";
  
  public static final String DEFAULT_BLOCK_CONTENT = "";
  
  public static final List<String> DEFAULT_CONFILTER_HITWORDS = Collections.emptyList();
  
  public static final String DEFAULT_NEED_VCODE = "";
  
  public static final String DEFAULT_PASS_TOKEN = "";
  
  public static final String DEFAULT_VCODE_MD5 = "";
  
  public static final String DEFAULT_VCODE_PIC_URL = "";
  
  public static final String DEFAULT_VCODE_PREV_TYPE = "";
  
  public static final String DEFAULT_VCODE_TYPE = "";
  
  @ProtoField(tag = 1)
  public final AccessState access_state;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String block_cancel;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String block_confirm;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String block_content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> confilter_hitwords;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String need_vcode;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String pass_token;
  
  @ProtoField(tag = 13)
  public final VcodeExtra vcode_extra;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String vcode_md5;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String vcode_pic_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String vcode_prev_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String vcode_type;
  
  public PostAntiInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.access_state = paramBuilder.access_state;
      List<String> list = paramBuilder.confilter_hitwords;
      if (list == null) {
        this.confilter_hitwords = DEFAULT_CONFILTER_HITWORDS;
      } else {
        this.confilter_hitwords = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.need_vcode;
      if (str == null) {
        this.need_vcode = "";
      } else {
        this.need_vcode = str;
      } 
      str = paramBuilder.vcode_md5;
      if (str == null) {
        this.vcode_md5 = "";
      } else {
        this.vcode_md5 = str;
      } 
      str = paramBuilder.vcode_prev_type;
      if (str == null) {
        this.vcode_prev_type = "";
      } else {
        this.vcode_prev_type = str;
      } 
      str = paramBuilder.vcode_type;
      if (str == null) {
        this.vcode_type = "";
      } else {
        this.vcode_type = str;
      } 
      str = paramBuilder.pass_token;
      if (str == null) {
        this.pass_token = "";
      } else {
        this.pass_token = str;
      } 
      str = paramBuilder.block_content;
      if (str == null) {
        this.block_content = "";
      } else {
        this.block_content = str;
      } 
      str = paramBuilder.block_cancel;
      if (str == null) {
        this.block_cancel = "";
      } else {
        this.block_cancel = str;
      } 
      str = paramBuilder.block_confirm;
      if (str == null) {
        this.block_confirm = "";
      } else {
        this.block_confirm = str;
      } 
      str = paramBuilder.vcode_pic_url;
      if (str == null) {
        this.vcode_pic_url = "";
      } else {
        this.vcode_pic_url = str;
      } 
      this.vcode_extra = paramBuilder.vcode_extra;
    } else {
      this.access_state = paramBuilder.access_state;
      this.confilter_hitwords = Message.immutableCopyOf(paramBuilder.confilter_hitwords);
      this.need_vcode = paramBuilder.need_vcode;
      this.vcode_md5 = paramBuilder.vcode_md5;
      this.vcode_prev_type = paramBuilder.vcode_prev_type;
      this.vcode_type = paramBuilder.vcode_type;
      this.pass_token = paramBuilder.pass_token;
      this.block_content = paramBuilder.block_content;
      this.block_cancel = paramBuilder.block_cancel;
      this.block_confirm = paramBuilder.block_confirm;
      this.vcode_pic_url = paramBuilder.vcode_pic_url;
      this.vcode_extra = paramBuilder.vcode_extra;
    } 
  }
  
  public PostAntiInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PostAntiInfo> {
    public AccessState access_state;
    
    public String block_cancel;
    
    public String block_confirm;
    
    public String block_content;
    
    public List<String> confilter_hitwords;
    
    public String need_vcode;
    
    public String pass_token;
    
    public VcodeExtra vcode_extra;
    
    public String vcode_md5;
    
    public String vcode_pic_url;
    
    public String vcode_prev_type;
    
    public String vcode_type;
    
    public Builder() {}
    
    public Builder(PostAntiInfo param1PostAntiInfo) {
      super(param1PostAntiInfo);
      if (param1PostAntiInfo == null)
        return; 
      this.access_state = param1PostAntiInfo.access_state;
      this.confilter_hitwords = Message.copyOf(param1PostAntiInfo.confilter_hitwords);
      this.need_vcode = param1PostAntiInfo.need_vcode;
      this.vcode_md5 = param1PostAntiInfo.vcode_md5;
      this.vcode_prev_type = param1PostAntiInfo.vcode_prev_type;
      this.vcode_type = param1PostAntiInfo.vcode_type;
      this.pass_token = param1PostAntiInfo.pass_token;
      this.block_content = param1PostAntiInfo.block_content;
      this.block_cancel = param1PostAntiInfo.block_cancel;
      this.block_confirm = param1PostAntiInfo.block_confirm;
      this.vcode_pic_url = param1PostAntiInfo.vcode_pic_url;
      this.vcode_extra = param1PostAntiInfo.vcode_extra;
    }
    
    public PostAntiInfo build(boolean param1Boolean) {
      return new PostAntiInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
