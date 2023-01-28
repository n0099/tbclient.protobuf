package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RewardCard extends Message {
  public static final String DEFAULT_BANNER_JUMP_URL = "";
  
  public static final String DEFAULT_BUTTON_TEXT = "";
  
  public static final String DEFAULT_END_TEXT = "";
  
  public static final String DEFAULT_END_TIME = "";
  
  public static final List<String> DEFAULT_HEAD_IMGS;
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_ID = "";
  
  public static final String DEFAULT_JOIN_NUM = "";
  
  public static final String DEFAULT_JOIN_SUCC_TEXT = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final List<RewardMaterial> DEFAULT_REWARD_MATERIAL = Collections.emptyList();
  
  public static final String DEFAULT_START_TEXT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TOTAL_NUM = "";
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String banner_jump_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String button_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String end_text;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String end_time;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13, type = Message.Datatype.STRING)
  public final List<String> head_imgs;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String join_num;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String join_succ_text;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 11)
  public final List<RewardMaterial> reward_material;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String start_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String total_num;
  
  static {
    DEFAULT_HEAD_IMGS = Collections.emptyList();
  }
  
  public RewardCard(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str3 = paramBuilder.id;
      if (str3 == null) {
        this.id = "";
      } else {
        this.id = str3;
      } 
      str3 = paramBuilder.icon;
      if (str3 == null) {
        this.icon = "";
      } else {
        this.icon = str3;
      } 
      str3 = paramBuilder.title;
      if (str3 == null) {
        this.title = "";
      } else {
        this.title = str3;
      } 
      str3 = paramBuilder.start_text;
      if (str3 == null) {
        this.start_text = "";
      } else {
        this.start_text = str3;
      } 
      str3 = paramBuilder.end_text;
      if (str3 == null) {
        this.end_text = "";
      } else {
        this.end_text = str3;
      } 
      str3 = paramBuilder.end_time;
      if (str3 == null) {
        this.end_time = "";
      } else {
        this.end_time = str3;
      } 
      str3 = paramBuilder.button_text;
      if (str3 == null) {
        this.button_text = "";
      } else {
        this.button_text = str3;
      } 
      str3 = paramBuilder.jump_url;
      if (str3 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str3;
      } 
      str3 = paramBuilder.join_num;
      if (str3 == null) {
        this.join_num = "";
      } else {
        this.join_num = str3;
      } 
      List<RewardMaterial> list1 = paramBuilder.reward_material;
      if (list1 == null) {
        this.reward_material = DEFAULT_REWARD_MATERIAL;
      } else {
        this.reward_material = Message.immutableCopyOf(list1);
      } 
      String str2 = paramBuilder.total_num;
      if (str2 == null) {
        this.total_num = "";
      } else {
        this.total_num = str2;
      } 
      List<String> list = paramBuilder.head_imgs;
      if (list == null) {
        this.head_imgs = DEFAULT_HEAD_IMGS;
      } else {
        this.head_imgs = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.join_succ_text;
      if (str1 == null) {
        this.join_succ_text = "";
      } else {
        this.join_succ_text = str1;
      } 
      str = paramBuilder.banner_jump_url;
      if (str == null) {
        this.banner_jump_url = "";
      } else {
        this.banner_jump_url = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.icon = ((Builder)str).icon;
      this.title = ((Builder)str).title;
      this.start_text = ((Builder)str).start_text;
      this.end_text = ((Builder)str).end_text;
      this.end_time = ((Builder)str).end_time;
      this.button_text = ((Builder)str).button_text;
      this.jump_url = ((Builder)str).jump_url;
      this.join_num = ((Builder)str).join_num;
      this.reward_material = Message.immutableCopyOf(((Builder)str).reward_material);
      this.total_num = ((Builder)str).total_num;
      this.head_imgs = Message.immutableCopyOf(((Builder)str).head_imgs);
      this.join_succ_text = ((Builder)str).join_succ_text;
      this.banner_jump_url = ((Builder)str).banner_jump_url;
    } 
  }
  
  public RewardCard(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RewardCard> {
    public String banner_jump_url;
    
    public String button_text;
    
    public String end_text;
    
    public String end_time;
    
    public List<String> head_imgs;
    
    public String icon;
    
    public String id;
    
    public String join_num;
    
    public String join_succ_text;
    
    public String jump_url;
    
    public List<RewardMaterial> reward_material;
    
    public String start_text;
    
    public String title;
    
    public String total_num;
    
    public Builder() {}
    
    public Builder(RewardCard param1RewardCard) {
      super(param1RewardCard);
      if (param1RewardCard == null)
        return; 
      this.id = param1RewardCard.id;
      this.icon = param1RewardCard.icon;
      this.title = param1RewardCard.title;
      this.start_text = param1RewardCard.start_text;
      this.end_text = param1RewardCard.end_text;
      this.end_time = param1RewardCard.end_time;
      this.button_text = param1RewardCard.button_text;
      this.jump_url = param1RewardCard.jump_url;
      this.join_num = param1RewardCard.join_num;
      this.reward_material = Message.copyOf(param1RewardCard.reward_material);
      this.total_num = param1RewardCard.total_num;
      this.head_imgs = Message.copyOf(param1RewardCard.head_imgs);
      this.join_succ_text = param1RewardCard.join_succ_text;
      this.banner_jump_url = param1RewardCard.banner_jump_url;
    }
    
    public RewardCard build(boolean param1Boolean) {
      return new RewardCard(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
