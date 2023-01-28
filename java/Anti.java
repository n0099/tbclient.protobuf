package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class Anti extends Message {
  public static final Integer DEFAULT_BLOCK_STAT;
  
  public static final Integer DEFAULT_CAN_GOODS;
  
  public static final Integer DEFAULT_DAYS_TOFREE;
  
  public static final List<DelThreadText> DEFAULT_DEL_THREAD_TEXT;
  
  public static final Integer DEFAULT_FORBID_FLAG;
  
  public static final String DEFAULT_FORBID_INFO = "";
  
  public static final Integer DEFAULT_HAS_CHANCE;
  
  public static final Integer DEFAULT_HIDE_STAT;
  
  public static final Integer DEFAULT_IFADDITION;
  
  public static final Integer DEFAULT_IFPOST;
  
  public static final Integer DEFAULT_IFPOSTA;
  
  public static final Integer DEFAULT_IFVOICE;
  
  public static final String DEFAULT_IFXIAOYING = "";
  
  public static final Boolean DEFAULT_IS_SEXYFORUM;
  
  public static final Integer DEFAULT_MULTI_DELTHREAD;
  
  public static final Integer DEFAULT_NEED_VCODE;
  
  public static final Integer DEFAULT_POLL_LEVEL;
  
  public static final String DEFAULT_POLL_MESSAGE = "";
  
  public static final Integer DEFAULT_REPLY_PRIVATE_FLAG;
  
  public static final String DEFAULT_TBS = "";
  
  public static final String DEFAULT_TEENMODE_INTERVAL = "";
  
  public static final Integer DEFAULT_USER_CHAT_BLOCK;
  
  public static final String DEFAULT_USER_MUTE = "";
  
  public static final String DEFAULT_VCODE_MD5 = "";
  
  public static final String DEFAULT_VCODE_PIC_URL = "";
  
  public static final Integer DEFAULT_VCODE_STAT;
  
  public static final String DEFAULT_VIDEO_LOCAL_MESSAGE = "";
  
  public static final String DEFAULT_VIDEO_MESSAGE = "";
  
  public static final String DEFAULT_VOICE_MESSAGE = "";
  
  @ProtoField(tag = 22)
  public final BlockPopInfo block_pop_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer block_stat;
  
  @ProtoField(tag = 27, type = Message.Datatype.INT32)
  public final Integer can_goods;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer days_tofree;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 24)
  public final List<DelThreadText> del_thread_text;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer forbid_flag;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String forbid_info;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer has_chance;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer hide_stat;
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer ifaddition;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer ifpost;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer ifposta;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer ifvoice;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String ifxiaoying;
  
  @ProtoField(tag = 28, type = Message.Datatype.BOOL)
  public final Boolean is_sexyforum;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer multi_delthread;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer need_vcode;
  
  @ProtoField(tag = 26, type = Message.Datatype.UINT32)
  public final Integer poll_level;
  
  @ProtoField(tag = 19, type = Message.Datatype.STRING)
  public final String poll_message;
  
  @ProtoField(tag = 23, type = Message.Datatype.INT32)
  public final Integer reply_private_flag;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tbs;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String teenmode_interval;
  
  @ProtoField(tag = 30, type = Message.Datatype.INT32)
  public final Integer user_chat_block;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String user_mute;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String vcode_md5;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String vcode_pic_url;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer vcode_stat;
  
  @ProtoField(tag = 21, type = Message.Datatype.STRING)
  public final String video_local_message;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String video_message;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String voice_message;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IFPOST = integer;
    DEFAULT_IFPOSTA = integer;
    DEFAULT_FORBID_FLAG = integer;
    DEFAULT_BLOCK_STAT = integer;
    DEFAULT_HIDE_STAT = integer;
    DEFAULT_VCODE_STAT = integer;
    DEFAULT_DAYS_TOFREE = integer;
    DEFAULT_HAS_CHANCE = integer;
    DEFAULT_IFVOICE = integer;
    DEFAULT_IFADDITION = integer;
    DEFAULT_NEED_VCODE = integer;
    DEFAULT_REPLY_PRIVATE_FLAG = integer;
    DEFAULT_DEL_THREAD_TEXT = Collections.emptyList();
    DEFAULT_MULTI_DELTHREAD = integer;
    DEFAULT_POLL_LEVEL = integer;
    DEFAULT_CAN_GOODS = integer;
    DEFAULT_IS_SEXYFORUM = Boolean.FALSE;
    DEFAULT_USER_CHAT_BLOCK = integer;
  }
  
  public Anti(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str5 = paramBuilder.tbs;
      if (str5 == null) {
        this.tbs = "";
      } else {
        this.tbs = str5;
      } 
      Integer integer5 = paramBuilder.ifpost;
      if (integer5 == null) {
        this.ifpost = DEFAULT_IFPOST;
      } else {
        this.ifpost = integer5;
      } 
      integer5 = paramBuilder.ifposta;
      if (integer5 == null) {
        this.ifposta = DEFAULT_IFPOSTA;
      } else {
        this.ifposta = integer5;
      } 
      integer5 = paramBuilder.forbid_flag;
      if (integer5 == null) {
        this.forbid_flag = DEFAULT_FORBID_FLAG;
      } else {
        this.forbid_flag = integer5;
      } 
      String str4 = paramBuilder.forbid_info;
      if (str4 == null) {
        this.forbid_info = "";
      } else {
        this.forbid_info = str4;
      } 
      Integer integer4 = paramBuilder.block_stat;
      if (integer4 == null) {
        this.block_stat = DEFAULT_BLOCK_STAT;
      } else {
        this.block_stat = integer4;
      } 
      integer4 = paramBuilder.hide_stat;
      if (integer4 == null) {
        this.hide_stat = DEFAULT_HIDE_STAT;
      } else {
        this.hide_stat = integer4;
      } 
      integer4 = paramBuilder.vcode_stat;
      if (integer4 == null) {
        this.vcode_stat = DEFAULT_VCODE_STAT;
      } else {
        this.vcode_stat = integer4;
      } 
      integer4 = paramBuilder.days_tofree;
      if (integer4 == null) {
        this.days_tofree = DEFAULT_DAYS_TOFREE;
      } else {
        this.days_tofree = integer4;
      } 
      integer4 = paramBuilder.has_chance;
      if (integer4 == null) {
        this.has_chance = DEFAULT_HAS_CHANCE;
      } else {
        this.has_chance = integer4;
      } 
      integer4 = paramBuilder.ifvoice;
      if (integer4 == null) {
        this.ifvoice = DEFAULT_IFVOICE;
      } else {
        this.ifvoice = integer4;
      } 
      String str3 = paramBuilder.voice_message;
      if (str3 == null) {
        this.voice_message = "";
      } else {
        this.voice_message = str3;
      } 
      Integer integer3 = paramBuilder.ifaddition;
      if (integer3 == null) {
        this.ifaddition = DEFAULT_IFADDITION;
      } else {
        this.ifaddition = integer3;
      } 
      integer3 = paramBuilder.need_vcode;
      if (integer3 == null) {
        this.need_vcode = DEFAULT_NEED_VCODE;
      } else {
        this.need_vcode = integer3;
      } 
      String str2 = paramBuilder.vcode_md5;
      if (str2 == null) {
        this.vcode_md5 = "";
      } else {
        this.vcode_md5 = str2;
      } 
      str2 = paramBuilder.vcode_pic_url;
      if (str2 == null) {
        this.vcode_pic_url = "";
      } else {
        this.vcode_pic_url = str2;
      } 
      str2 = paramBuilder.user_mute;
      if (str2 == null) {
        this.user_mute = "";
      } else {
        this.user_mute = str2;
      } 
      str2 = paramBuilder.ifxiaoying;
      if (str2 == null) {
        this.ifxiaoying = "";
      } else {
        this.ifxiaoying = str2;
      } 
      str2 = paramBuilder.poll_message;
      if (str2 == null) {
        this.poll_message = "";
      } else {
        this.poll_message = str2;
      } 
      str2 = paramBuilder.video_message;
      if (str2 == null) {
        this.video_message = "";
      } else {
        this.video_message = str2;
      } 
      str2 = paramBuilder.video_local_message;
      if (str2 == null) {
        this.video_local_message = "";
      } else {
        this.video_local_message = str2;
      } 
      this.block_pop_info = paramBuilder.block_pop_info;
      Integer integer2 = paramBuilder.reply_private_flag;
      if (integer2 == null) {
        this.reply_private_flag = DEFAULT_REPLY_PRIVATE_FLAG;
      } else {
        this.reply_private_flag = integer2;
      } 
      List<DelThreadText> list = paramBuilder.del_thread_text;
      if (list == null) {
        this.del_thread_text = DEFAULT_DEL_THREAD_TEXT;
      } else {
        this.del_thread_text = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.multi_delthread;
      if (integer1 == null) {
        this.multi_delthread = DEFAULT_MULTI_DELTHREAD;
      } else {
        this.multi_delthread = integer1;
      } 
      integer1 = paramBuilder.poll_level;
      if (integer1 == null) {
        this.poll_level = DEFAULT_POLL_LEVEL;
      } else {
        this.poll_level = integer1;
      } 
      integer1 = paramBuilder.can_goods;
      if (integer1 == null) {
        this.can_goods = DEFAULT_CAN_GOODS;
      } else {
        this.can_goods = integer1;
      } 
      Boolean bool = paramBuilder.is_sexyforum;
      if (bool == null) {
        this.is_sexyforum = DEFAULT_IS_SEXYFORUM;
      } else {
        this.is_sexyforum = bool;
      } 
      String str1 = paramBuilder.teenmode_interval;
      if (str1 == null) {
        this.teenmode_interval = "";
      } else {
        this.teenmode_interval = str1;
      } 
      integer = paramBuilder.user_chat_block;
      if (integer == null) {
        this.user_chat_block = DEFAULT_USER_CHAT_BLOCK;
      } else {
        this.user_chat_block = integer;
      } 
    } else {
      this.tbs = ((Builder)integer).tbs;
      this.ifpost = ((Builder)integer).ifpost;
      this.ifposta = ((Builder)integer).ifposta;
      this.forbid_flag = ((Builder)integer).forbid_flag;
      this.forbid_info = ((Builder)integer).forbid_info;
      this.block_stat = ((Builder)integer).block_stat;
      this.hide_stat = ((Builder)integer).hide_stat;
      this.vcode_stat = ((Builder)integer).vcode_stat;
      this.days_tofree = ((Builder)integer).days_tofree;
      this.has_chance = ((Builder)integer).has_chance;
      this.ifvoice = ((Builder)integer).ifvoice;
      this.voice_message = ((Builder)integer).voice_message;
      this.ifaddition = ((Builder)integer).ifaddition;
      this.need_vcode = ((Builder)integer).need_vcode;
      this.vcode_md5 = ((Builder)integer).vcode_md5;
      this.vcode_pic_url = ((Builder)integer).vcode_pic_url;
      this.user_mute = ((Builder)integer).user_mute;
      this.ifxiaoying = ((Builder)integer).ifxiaoying;
      this.poll_message = ((Builder)integer).poll_message;
      this.video_message = ((Builder)integer).video_message;
      this.video_local_message = ((Builder)integer).video_local_message;
      this.block_pop_info = ((Builder)integer).block_pop_info;
      this.reply_private_flag = ((Builder)integer).reply_private_flag;
      this.del_thread_text = Message.immutableCopyOf(((Builder)integer).del_thread_text);
      this.multi_delthread = ((Builder)integer).multi_delthread;
      this.poll_level = ((Builder)integer).poll_level;
      this.can_goods = ((Builder)integer).can_goods;
      this.is_sexyforum = ((Builder)integer).is_sexyforum;
      this.teenmode_interval = ((Builder)integer).teenmode_interval;
      this.user_chat_block = ((Builder)integer).user_chat_block;
    } 
  }
  
  public Anti(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Anti> {
    public BlockPopInfo block_pop_info;
    
    public Integer block_stat;
    
    public Integer can_goods;
    
    public Integer days_tofree;
    
    public List<DelThreadText> del_thread_text;
    
    public Integer forbid_flag;
    
    public String forbid_info;
    
    public Integer has_chance;
    
    public Integer hide_stat;
    
    public Integer ifaddition;
    
    public Integer ifpost;
    
    public Integer ifposta;
    
    public Integer ifvoice;
    
    public String ifxiaoying;
    
    public Boolean is_sexyforum;
    
    public Integer multi_delthread;
    
    public Integer need_vcode;
    
    public Integer poll_level;
    
    public String poll_message;
    
    public Integer reply_private_flag;
    
    public String tbs;
    
    public String teenmode_interval;
    
    public Integer user_chat_block;
    
    public String user_mute;
    
    public String vcode_md5;
    
    public String vcode_pic_url;
    
    public Integer vcode_stat;
    
    public String video_local_message;
    
    public String video_message;
    
    public String voice_message;
    
    public Builder() {}
    
    public Builder(Anti param1Anti) {
      super(param1Anti);
      if (param1Anti == null)
        return; 
      this.tbs = param1Anti.tbs;
      this.ifpost = param1Anti.ifpost;
      this.ifposta = param1Anti.ifposta;
      this.forbid_flag = param1Anti.forbid_flag;
      this.forbid_info = param1Anti.forbid_info;
      this.block_stat = param1Anti.block_stat;
      this.hide_stat = param1Anti.hide_stat;
      this.vcode_stat = param1Anti.vcode_stat;
      this.days_tofree = param1Anti.days_tofree;
      this.has_chance = param1Anti.has_chance;
      this.ifvoice = param1Anti.ifvoice;
      this.voice_message = param1Anti.voice_message;
      this.ifaddition = param1Anti.ifaddition;
      this.need_vcode = param1Anti.need_vcode;
      this.vcode_md5 = param1Anti.vcode_md5;
      this.vcode_pic_url = param1Anti.vcode_pic_url;
      this.user_mute = param1Anti.user_mute;
      this.ifxiaoying = param1Anti.ifxiaoying;
      this.poll_message = param1Anti.poll_message;
      this.video_message = param1Anti.video_message;
      this.video_local_message = param1Anti.video_local_message;
      this.block_pop_info = param1Anti.block_pop_info;
      this.reply_private_flag = param1Anti.reply_private_flag;
      this.del_thread_text = Message.copyOf(param1Anti.del_thread_text);
      this.multi_delthread = param1Anti.multi_delthread;
      this.poll_level = param1Anti.poll_level;
      this.can_goods = param1Anti.can_goods;
      this.is_sexyforum = param1Anti.is_sexyforum;
      this.teenmode_interval = param1Anti.teenmode_interval;
      this.user_chat_block = param1Anti.user_chat_block;
    }
    
    public Anti build(boolean param1Boolean) {
      return new Anti(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
