package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReplyExp extends Message {
  public static final String DEFAULT_COLOR_MSG = "";
  
  public static final String DEFAULT_CURRENT_LEVEL = "";
  
  public static final String DEFAULT_CURRENT_LEVEL_MAX_EXP = "";
  
  public static final String DEFAULT_INC = "";
  
  public static final String DEFAULT_OLD = "";
  
  public static final String DEFAULT_PRE_MSG = "";
  
  public static final String DEFAULT_QUESTION_EXP = "";
  
  public static final String DEFAULT_QUESTION_MSG = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String color_msg;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String current_level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String current_level_max_exp;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String inc;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String old;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pre_msg;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String question_exp;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String question_msg;
  
  public ReplyExp(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pre_msg;
      if (str1 == null) {
        this.pre_msg = "";
      } else {
        this.pre_msg = str1;
      } 
      str1 = paramBuilder.color_msg;
      if (str1 == null) {
        this.color_msg = "";
      } else {
        this.color_msg = str1;
      } 
      str1 = paramBuilder.current_level_max_exp;
      if (str1 == null) {
        this.current_level_max_exp = "";
      } else {
        this.current_level_max_exp = str1;
      } 
      str1 = paramBuilder.current_level;
      if (str1 == null) {
        this.current_level = "";
      } else {
        this.current_level = str1;
      } 
      str1 = paramBuilder.old;
      if (str1 == null) {
        this.old = "";
      } else {
        this.old = str1;
      } 
      str1 = paramBuilder.inc;
      if (str1 == null) {
        this.inc = "";
      } else {
        this.inc = str1;
      } 
      str1 = paramBuilder.question_msg;
      if (str1 == null) {
        this.question_msg = "";
      } else {
        this.question_msg = str1;
      } 
      str = paramBuilder.question_exp;
      if (str == null) {
        this.question_exp = "";
      } else {
        this.question_exp = str;
      } 
    } else {
      this.pre_msg = ((Builder)str).pre_msg;
      this.color_msg = ((Builder)str).color_msg;
      this.current_level_max_exp = ((Builder)str).current_level_max_exp;
      this.current_level = ((Builder)str).current_level;
      this.old = ((Builder)str).old;
      this.inc = ((Builder)str).inc;
      this.question_msg = ((Builder)str).question_msg;
      this.question_exp = ((Builder)str).question_exp;
    } 
  }
  
  public ReplyExp(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyExp> {
    public String color_msg;
    
    public String current_level;
    
    public String current_level_max_exp;
    
    public String inc;
    
    public String old;
    
    public String pre_msg;
    
    public String question_exp;
    
    public String question_msg;
    
    public Builder() {}
    
    public Builder(ReplyExp param1ReplyExp) {
      super(param1ReplyExp);
      if (param1ReplyExp == null)
        return; 
      this.pre_msg = param1ReplyExp.pre_msg;
      this.color_msg = param1ReplyExp.color_msg;
      this.current_level_max_exp = param1ReplyExp.current_level_max_exp;
      this.current_level = param1ReplyExp.current_level;
      this.old = param1ReplyExp.old;
      this.inc = param1ReplyExp.inc;
      this.question_msg = param1ReplyExp.question_msg;
      this.question_exp = param1ReplyExp.question_exp;
    }
    
    public ReplyExp build(boolean param1Boolean) {
      return new ReplyExp(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
