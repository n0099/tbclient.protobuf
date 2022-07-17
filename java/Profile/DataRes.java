package tbclient.Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerImage;
import tbclient.DealWindow;
import tbclient.DuxiaomanEntry;
import tbclient.DynamicInfo;
import tbclient.Feedback;
import tbclient.ForumDynamic;
import tbclient.GoodsWin;
import tbclient.Highlist;
import tbclient.HotUserRankEntry;
import tbclient.ModuleInfo;
import tbclient.PostInfoList;
import tbclient.SmartApp;
import tbclient.TbBookrack;
import tbclient.ThreadInfo;
import tbclient.UcCard;
import tbclient.User;
import tbclient.UserManChannelInfo;
import tbclient.UserMap;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_RECORD;
  
  public static final List<BannerImage> DEFAULT_BANNER;
  
  public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST;
  
  public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST;
  
  public static final Integer DEFAULT_IS_BLACK_WHITE;
  
  public static final List<ThreadInfo> DEFAULT_NEWEST_DYNAMIC_LIST;
  
  public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final List<SmartApp> DEFAULT_RECOM_SWAN_LIST;
  
  public static final String DEFAULT_UK = "";
  
  public static final List<UserMap> DEFAULT_URL_MAP;
  
  public static final Integer DEFAULT_WORK_TAB_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 16)
  public final AlaLiveInfo ala_live_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 19)
  public final List<AlaLiveInfo> ala_live_record;
  
  @ProtoField(tag = 2)
  public final Anti anti_stat;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 22)
  public final List<BannerImage> banner;
  
  @ProtoField(tag = 36)
  public final MemberBlockInfo block_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<ForumDynamic> concerned_forum_list;
  
  @ProtoField(tag = 24)
  public final Duxiaoman duxiaoman;
  
  @ProtoField(tag = 37)
  public final DuxiaomanEntry duxiaoman_entry;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<DynamicInfo> dynamic_list;
  
  @ProtoField(tag = 10)
  public final Feedback feedback;
  
  @ProtoField(tag = 35)
  public final FinanceTab finance_tab;
  
  @ProtoField(tag = 26)
  public final GoodsWin goods_win;
  
  @ProtoField(tag = 7)
  public final Highlist highs;
  
  @ProtoField(tag = 29, type = Message.Datatype.INT32)
  public final Integer is_black_white;
  
  @ProtoField(tag = 15)
  public final ModuleInfo module_info;
  
  @ProtoField(tag = 27)
  public final HotUserRankEntry new_god_rankinfo;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 25)
  public final List<ThreadInfo> newest_dynamic_list;
  
  @ProtoField(tag = 17)
  public final NicknameInfo nickname_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<PostInfoList> post_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<SmartApp> recom_swan_list;
  
  @ProtoField(tag = 3)
  public final TAInfo tainfo;
  
  @ProtoField(tag = 9)
  public final TbBookrack tbbookrack;
  
  @ProtoField(tag = 6)
  public final UcCard uc_card;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String uk;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 20)
  public final List<UserMap> url_map;
  
  @ProtoField(tag = 1)
  public final User user;
  
  @ProtoField(tag = 14)
  public final UserAgreeInfo user_agree_info;
  
  @ProtoField(tag = 5)
  public final UserGodInfo user_god_info;
  
  @ProtoField(tag = 11)
  public final UserManChannelInfo video_channel_info;
  
  @ProtoField(tag = 8)
  public final DealWindow window;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT32)
  public final Integer work_tab_id;
  
  static {
    DEFAULT_DYNAMIC_LIST = Collections.emptyList();
    DEFAULT_CONCERNED_FORUM_LIST = Collections.emptyList();
    DEFAULT_ALA_LIVE_RECORD = Collections.emptyList();
    DEFAULT_URL_MAP = Collections.emptyList();
    DEFAULT_BANNER = Collections.emptyList();
    DEFAULT_RECOM_SWAN_LIST = Collections.emptyList();
    DEFAULT_NEWEST_DYNAMIC_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BLACK_WHITE = integer;
    DEFAULT_WORK_TAB_ID = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.anti_stat = paramBuilder.anti_stat;
      this.tainfo = paramBuilder.tainfo;
      List<PostInfoList> list7 = paramBuilder.post_list;
      if (list7 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list7);
      } 
      this.user_god_info = paramBuilder.user_god_info;
      this.uc_card = paramBuilder.uc_card;
      this.highs = paramBuilder.highs;
      this.window = paramBuilder.window;
      this.tbbookrack = paramBuilder.tbbookrack;
      this.feedback = paramBuilder.feedback;
      this.video_channel_info = paramBuilder.video_channel_info;
      List<DynamicInfo> list6 = paramBuilder.dynamic_list;
      if (list6 == null) {
        this.dynamic_list = DEFAULT_DYNAMIC_LIST;
      } else {
        this.dynamic_list = Message.immutableCopyOf(list6);
      } 
      List<ForumDynamic> list5 = paramBuilder.concerned_forum_list;
      if (list5 == null) {
        this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
      } else {
        this.concerned_forum_list = Message.immutableCopyOf(list5);
      } 
      this.user_agree_info = paramBuilder.user_agree_info;
      this.module_info = paramBuilder.module_info;
      this.ala_live_info = paramBuilder.ala_live_info;
      this.nickname_info = paramBuilder.nickname_info;
      List<AlaLiveInfo> list4 = paramBuilder.ala_live_record;
      if (list4 == null) {
        this.ala_live_record = DEFAULT_ALA_LIVE_RECORD;
      } else {
        this.ala_live_record = Message.immutableCopyOf(list4);
      } 
      List<UserMap> list3 = paramBuilder.url_map;
      if (list3 == null) {
        this.url_map = DEFAULT_URL_MAP;
      } else {
        this.url_map = Message.immutableCopyOf(list3);
      } 
      List<BannerImage> list2 = paramBuilder.banner;
      if (list2 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = Message.immutableCopyOf(list2);
      } 
      List<SmartApp> list1 = paramBuilder.recom_swan_list;
      if (list1 == null) {
        this.recom_swan_list = DEFAULT_RECOM_SWAN_LIST;
      } else {
        this.recom_swan_list = Message.immutableCopyOf(list1);
      } 
      this.duxiaoman = paramBuilder.duxiaoman;
      List<ThreadInfo> list = paramBuilder.newest_dynamic_list;
      if (list == null) {
        this.newest_dynamic_list = DEFAULT_NEWEST_DYNAMIC_LIST;
      } else {
        this.newest_dynamic_list = Message.immutableCopyOf(list);
      } 
      this.goods_win = paramBuilder.goods_win;
      this.new_god_rankinfo = paramBuilder.new_god_rankinfo;
      String str = paramBuilder.uk;
      if (str == null) {
        this.uk = "";
      } else {
        this.uk = str;
      } 
      Integer integer = paramBuilder.is_black_white;
      if (integer == null) {
        this.is_black_white = DEFAULT_IS_BLACK_WHITE;
      } else {
        this.is_black_white = integer;
      } 
      integer = paramBuilder.work_tab_id;
      if (integer == null) {
        this.work_tab_id = DEFAULT_WORK_TAB_ID;
      } else {
        this.work_tab_id = integer;
      } 
      this.finance_tab = paramBuilder.finance_tab;
      this.block_info = paramBuilder.block_info;
      this.duxiaoman_entry = paramBuilder.duxiaoman_entry;
    } else {
      this.user = paramBuilder.user;
      this.anti_stat = paramBuilder.anti_stat;
      this.tainfo = paramBuilder.tainfo;
      this.post_list = Message.immutableCopyOf(paramBuilder.post_list);
      this.user_god_info = paramBuilder.user_god_info;
      this.uc_card = paramBuilder.uc_card;
      this.highs = paramBuilder.highs;
      this.window = paramBuilder.window;
      this.tbbookrack = paramBuilder.tbbookrack;
      this.feedback = paramBuilder.feedback;
      this.video_channel_info = paramBuilder.video_channel_info;
      this.dynamic_list = Message.immutableCopyOf(paramBuilder.dynamic_list);
      this.concerned_forum_list = Message.immutableCopyOf(paramBuilder.concerned_forum_list);
      this.user_agree_info = paramBuilder.user_agree_info;
      this.module_info = paramBuilder.module_info;
      this.ala_live_info = paramBuilder.ala_live_info;
      this.nickname_info = paramBuilder.nickname_info;
      this.ala_live_record = Message.immutableCopyOf(paramBuilder.ala_live_record);
      this.url_map = Message.immutableCopyOf(paramBuilder.url_map);
      this.banner = Message.immutableCopyOf(paramBuilder.banner);
      this.recom_swan_list = Message.immutableCopyOf(paramBuilder.recom_swan_list);
      this.duxiaoman = paramBuilder.duxiaoman;
      this.newest_dynamic_list = Message.immutableCopyOf(paramBuilder.newest_dynamic_list);
      this.goods_win = paramBuilder.goods_win;
      this.new_god_rankinfo = paramBuilder.new_god_rankinfo;
      this.uk = paramBuilder.uk;
      this.is_black_white = paramBuilder.is_black_white;
      this.work_tab_id = paramBuilder.work_tab_id;
      this.finance_tab = paramBuilder.finance_tab;
      this.block_info = paramBuilder.block_info;
      this.duxiaoman_entry = paramBuilder.duxiaoman_entry;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1548228331, "Ltbclient/Profile/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1548228331, "Ltbclient/Profile/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public AlaLiveInfo ala_live_info;
    
    public List<AlaLiveInfo> ala_live_record;
    
    public Anti anti_stat;
    
    public List<BannerImage> banner;
    
    public MemberBlockInfo block_info;
    
    public List<ForumDynamic> concerned_forum_list;
    
    public Duxiaoman duxiaoman;
    
    public DuxiaomanEntry duxiaoman_entry;
    
    public List<DynamicInfo> dynamic_list;
    
    public Feedback feedback;
    
    public FinanceTab finance_tab;
    
    public GoodsWin goods_win;
    
    public Highlist highs;
    
    public Integer is_black_white;
    
    public ModuleInfo module_info;
    
    public HotUserRankEntry new_god_rankinfo;
    
    public List<ThreadInfo> newest_dynamic_list;
    
    public NicknameInfo nickname_info;
    
    public List<PostInfoList> post_list;
    
    public List<SmartApp> recom_swan_list;
    
    public TAInfo tainfo;
    
    public TbBookrack tbbookrack;
    
    public UcCard uc_card;
    
    public String uk;
    
    public List<UserMap> url_map;
    
    public User user;
    
    public UserAgreeInfo user_agree_info;
    
    public UserGodInfo user_god_info;
    
    public UserManChannelInfo video_channel_info;
    
    public DealWindow window;
    
    public Integer work_tab_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user = param1DataRes.user;
      this.anti_stat = param1DataRes.anti_stat;
      this.tainfo = param1DataRes.tainfo;
      this.post_list = Message.copyOf(param1DataRes.post_list);
      this.user_god_info = param1DataRes.user_god_info;
      this.uc_card = param1DataRes.uc_card;
      this.highs = param1DataRes.highs;
      this.window = param1DataRes.window;
      this.tbbookrack = param1DataRes.tbbookrack;
      this.feedback = param1DataRes.feedback;
      this.video_channel_info = param1DataRes.video_channel_info;
      this.dynamic_list = Message.copyOf(param1DataRes.dynamic_list);
      this.concerned_forum_list = Message.copyOf(param1DataRes.concerned_forum_list);
      this.user_agree_info = param1DataRes.user_agree_info;
      this.module_info = param1DataRes.module_info;
      this.ala_live_info = param1DataRes.ala_live_info;
      this.nickname_info = param1DataRes.nickname_info;
      this.ala_live_record = Message.copyOf(param1DataRes.ala_live_record);
      this.url_map = Message.copyOf(param1DataRes.url_map);
      this.banner = Message.copyOf(param1DataRes.banner);
      this.recom_swan_list = Message.copyOf(param1DataRes.recom_swan_list);
      this.duxiaoman = param1DataRes.duxiaoman;
      this.newest_dynamic_list = Message.copyOf(param1DataRes.newest_dynamic_list);
      this.goods_win = param1DataRes.goods_win;
      this.new_god_rankinfo = param1DataRes.new_god_rankinfo;
      this.uk = param1DataRes.uk;
      this.is_black_white = param1DataRes.is_black_white;
      this.work_tab_id = param1DataRes.work_tab_id;
      this.finance_tab = param1DataRes.finance_tab;
      this.block_info = param1DataRes.block_info;
      this.duxiaoman_entry = param1DataRes.duxiaoman_entry;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
