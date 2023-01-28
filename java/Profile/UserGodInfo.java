package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class UserGodInfo extends Message {
  public static final String DEFAULT_ADDRESS = "";
  
  public static final Integer DEFAULT_AGE;
  
  public static final Integer DEFAULT_CUR_PAGE;
  
  public static final List<ForumGodDetailInfo> DEFAULT_FORUM_GOD_LIST;
  
  public static final Integer DEFAULT_GOD_TYPE;
  
  public static final Integer DEFAULT_SEX;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
  
  public static final String DEFAULT_TOTAL_THREAD = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String address;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer age;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer cur_page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ForumGodDetailInfo> forum_god_list;
  
  @ProtoField(tag = 2)
  public final GodDetailInfo god_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer god_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer sex;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String total_thread;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_GOD_TYPE = integer;
    DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
    DEFAULT_SEX = integer;
    DEFAULT_AGE = integer;
    DEFAULT_THREAD_LIST = Collections.emptyList();
    DEFAULT_CUR_PAGE = integer;
  }
  
  public UserGodInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.god_type;
      if (integer3 == null) {
        this.god_type = DEFAULT_GOD_TYPE;
      } else {
        this.god_type = integer3;
      } 
      this.god_info = paramBuilder.god_info;
      List<ForumGodDetailInfo> list1 = paramBuilder.forum_god_list;
      if (list1 == null) {
        this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
      } else {
        this.forum_god_list = Message.immutableCopyOf(list1);
      } 
      Integer integer2 = paramBuilder.sex;
      if (integer2 == null) {
        this.sex = DEFAULT_SEX;
      } else {
        this.sex = integer2;
      } 
      integer2 = paramBuilder.age;
      if (integer2 == null) {
        this.age = DEFAULT_AGE;
      } else {
        this.age = integer2;
      } 
      String str1 = paramBuilder.address;
      if (str1 == null) {
        this.address = "";
      } else {
        this.address = str1;
      } 
      List<ThreadInfo> list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.cur_page;
      if (integer1 == null) {
        this.cur_page = DEFAULT_CUR_PAGE;
      } else {
        this.cur_page = integer1;
      } 
      str = paramBuilder.total_thread;
      if (str == null) {
        this.total_thread = "";
      } else {
        this.total_thread = str;
      } 
    } else {
      this.god_type = ((Builder)str).god_type;
      this.god_info = ((Builder)str).god_info;
      this.forum_god_list = Message.immutableCopyOf(((Builder)str).forum_god_list);
      this.sex = ((Builder)str).sex;
      this.age = ((Builder)str).age;
      this.address = ((Builder)str).address;
      this.thread_list = Message.immutableCopyOf(((Builder)str).thread_list);
      this.cur_page = ((Builder)str).cur_page;
      this.total_thread = ((Builder)str).total_thread;
    } 
  }
  
  public UserGodInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserGodInfo> {
    public String address;
    
    public Integer age;
    
    public Integer cur_page;
    
    public List<ForumGodDetailInfo> forum_god_list;
    
    public GodDetailInfo god_info;
    
    public Integer god_type;
    
    public Integer sex;
    
    public List<ThreadInfo> thread_list;
    
    public String total_thread;
    
    public Builder() {}
    
    public Builder(UserGodInfo param1UserGodInfo) {
      super(param1UserGodInfo);
      if (param1UserGodInfo == null)
        return; 
      this.god_type = param1UserGodInfo.god_type;
      this.god_info = param1UserGodInfo.god_info;
      this.forum_god_list = Message.copyOf(param1UserGodInfo.forum_god_list);
      this.sex = param1UserGodInfo.sex;
      this.age = param1UserGodInfo.age;
      this.address = param1UserGodInfo.address;
      this.thread_list = Message.copyOf(param1UserGodInfo.thread_list);
      this.cur_page = param1UserGodInfo.cur_page;
      this.total_thread = param1UserGodInfo.total_thread;
    }
    
    public UserGodInfo build(boolean param1Boolean) {
      return new UserGodInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
