package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.Anti;
import tbclient.BannerImage;
import tbclient.BubbleInfo;
import tbclient.CustomGrid;
import tbclient.DealWindow;
import tbclient.DynamicInfo;
import tbclient.Feedback;
import tbclient.ForumDynamic;
import tbclient.GoodsWin;
import tbclient.Highlist;
import tbclient.HotUserRankEntry;
import tbclient.ModuleInfo;
import tbclient.NamoaixudEntry;
import tbclient.PostInfoList;
import tbclient.SmartApp;
import tbclient.TbBookrack;
import tbclient.ThreadInfo;
import tbclient.UcCard;
import tbclient.UcCardInfo;
import tbclient.User;
import tbclient.UserManChannelInfo;
import tbclient.UserMap;

public final class DataRes extends Message {
  public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_RECORD;
  
  public static final List<BannerImage> DEFAULT_BANNER;
  
  public static final List<UcCardInfo> DEFAULT_COMMON_CARD;
  
  public static final List<ForumDynamic> DEFAULT_CONCERNED_FORUM_LIST;
  
  public static final List<CustomGrid> DEFAULT_CUSTOM_GRID;
  
  public static final List<DynamicInfo> DEFAULT_DYNAMIC_LIST;
  
  public static final Integer DEFAULT_IS_BLACK_WHITE;
  
  public static final List<CustomGrid> DEFAULT_MORE_GRID;
  
  public static final List<ThreadInfo> DEFAULT_NEWEST_DYNAMIC_LIST;
  
  public static final List<PostInfoList> DEFAULT_POST_LIST = Collections.emptyList();
  
  public static final List<SmartApp> DEFAULT_RECOM_NAWS_LIST;
  
  public static final String DEFAULT_UK = "";
  
  public static final List<UserMap> DEFAULT_URL_MAP;
  
  public static final Integer DEFAULT_WORK_TAB_ID;
  
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
  
  @ProtoField(tag = 38)
  public final BubbleInfo bubble_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 40)
  public final List<UcCardInfo> common_card;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<ForumDynamic> concerned_forum_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 41)
  public final List<CustomGrid> custom_grid;
  
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
  
  @ProtoField(label = Message.Label.REPEATED, tag = 42)
  public final List<CustomGrid> more_grid;
  
  @ProtoField(tag = 24)
  public final Namoaixud namoaixud;
  
  @ProtoField(tag = 37)
  public final NamoaixudEntry namoaixud_entry;
  
  @ProtoField(tag = 27)
  public final HotUserRankEntry new_god_rankinfo;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 25)
  public final List<ThreadInfo> newest_dynamic_list;
  
  @ProtoField(tag = 17)
  public final NicknameInfo nickname_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<PostInfoList> post_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 23)
  public final List<SmartApp> recom_naws_list;
  
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
  
  @ProtoField(tag = 39)
  public final VipBanner vip_banner;
  
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
    DEFAULT_RECOM_NAWS_LIST = Collections.emptyList();
    DEFAULT_NEWEST_DYNAMIC_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BLACK_WHITE = integer;
    DEFAULT_WORK_TAB_ID = integer;
    DEFAULT_COMMON_CARD = Collections.emptyList();
    DEFAULT_CUSTOM_GRID = Collections.emptyList();
    DEFAULT_MORE_GRID = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<CustomGrid> list;
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.anti_stat = paramBuilder.anti_stat;
      this.tainfo = paramBuilder.tainfo;
      List<PostInfoList> list10 = paramBuilder.post_list;
      if (list10 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list10);
      } 
      this.user_god_info = paramBuilder.user_god_info;
      this.uc_card = paramBuilder.uc_card;
      this.highs = paramBuilder.highs;
      this.window = paramBuilder.window;
      this.tbbookrack = paramBuilder.tbbookrack;
      this.feedback = paramBuilder.feedback;
      this.video_channel_info = paramBuilder.video_channel_info;
      List<DynamicInfo> list9 = paramBuilder.dynamic_list;
      if (list9 == null) {
        this.dynamic_list = DEFAULT_DYNAMIC_LIST;
      } else {
        this.dynamic_list = Message.immutableCopyOf(list9);
      } 
      List<ForumDynamic> list8 = paramBuilder.concerned_forum_list;
      if (list8 == null) {
        this.concerned_forum_list = DEFAULT_CONCERNED_FORUM_LIST;
      } else {
        this.concerned_forum_list = Message.immutableCopyOf(list8);
      } 
      this.user_agree_info = paramBuilder.user_agree_info;
      this.module_info = paramBuilder.module_info;
      this.ala_live_info = paramBuilder.ala_live_info;
      this.nickname_info = paramBuilder.nickname_info;
      List<AlaLiveInfo> list7 = paramBuilder.ala_live_record;
      if (list7 == null) {
        this.ala_live_record = DEFAULT_ALA_LIVE_RECORD;
      } else {
        this.ala_live_record = Message.immutableCopyOf(list7);
      } 
      List<UserMap> list6 = paramBuilder.url_map;
      if (list6 == null) {
        this.url_map = DEFAULT_URL_MAP;
      } else {
        this.url_map = Message.immutableCopyOf(list6);
      } 
      List<BannerImage> list5 = paramBuilder.banner;
      if (list5 == null) {
        this.banner = DEFAULT_BANNER;
      } else {
        this.banner = Message.immutableCopyOf(list5);
      } 
      List<SmartApp> list4 = paramBuilder.recom_naws_list;
      if (list4 == null) {
        this.recom_naws_list = DEFAULT_RECOM_NAWS_LIST;
      } else {
        this.recom_naws_list = Message.immutableCopyOf(list4);
      } 
      this.namoaixud = paramBuilder.namoaixud;
      List<ThreadInfo> list3 = paramBuilder.newest_dynamic_list;
      if (list3 == null) {
        this.newest_dynamic_list = DEFAULT_NEWEST_DYNAMIC_LIST;
      } else {
        this.newest_dynamic_list = Message.immutableCopyOf(list3);
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
      this.namoaixud_entry = paramBuilder.namoaixud_entry;
      this.bubble_info = paramBuilder.bubble_info;
      this.vip_banner = paramBuilder.vip_banner;
      List<UcCardInfo> list2 = paramBuilder.common_card;
      if (list2 == null) {
        this.common_card = DEFAULT_COMMON_CARD;
      } else {
        this.common_card = Message.immutableCopyOf(list2);
      } 
      List<CustomGrid> list1 = paramBuilder.custom_grid;
      if (list1 == null) {
        this.custom_grid = DEFAULT_CUSTOM_GRID;
      } else {
        this.custom_grid = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.more_grid;
      if (list == null) {
        this.more_grid = DEFAULT_MORE_GRID;
      } else {
        this.more_grid = Message.immutableCopyOf(list);
      } 
    } else {
      this.user = ((Builder)list).user;
      this.anti_stat = ((Builder)list).anti_stat;
      this.tainfo = ((Builder)list).tainfo;
      this.post_list = Message.immutableCopyOf(((Builder)list).post_list);
      this.user_god_info = ((Builder)list).user_god_info;
      this.uc_card = ((Builder)list).uc_card;
      this.highs = ((Builder)list).highs;
      this.window = ((Builder)list).window;
      this.tbbookrack = ((Builder)list).tbbookrack;
      this.feedback = ((Builder)list).feedback;
      this.video_channel_info = ((Builder)list).video_channel_info;
      this.dynamic_list = Message.immutableCopyOf(((Builder)list).dynamic_list);
      this.concerned_forum_list = Message.immutableCopyOf(((Builder)list).concerned_forum_list);
      this.user_agree_info = ((Builder)list).user_agree_info;
      this.module_info = ((Builder)list).module_info;
      this.ala_live_info = ((Builder)list).ala_live_info;
      this.nickname_info = ((Builder)list).nickname_info;
      this.ala_live_record = Message.immutableCopyOf(((Builder)list).ala_live_record);
      this.url_map = Message.immutableCopyOf(((Builder)list).url_map);
      this.banner = Message.immutableCopyOf(((Builder)list).banner);
      this.recom_naws_list = Message.immutableCopyOf(((Builder)list).recom_naws_list);
      this.namoaixud = ((Builder)list).namoaixud;
      this.newest_dynamic_list = Message.immutableCopyOf(((Builder)list).newest_dynamic_list);
      this.goods_win = ((Builder)list).goods_win;
      this.new_god_rankinfo = ((Builder)list).new_god_rankinfo;
      this.uk = ((Builder)list).uk;
      this.is_black_white = ((Builder)list).is_black_white;
      this.work_tab_id = ((Builder)list).work_tab_id;
      this.finance_tab = ((Builder)list).finance_tab;
      this.block_info = ((Builder)list).block_info;
      this.namoaixud_entry = ((Builder)list).namoaixud_entry;
      this.bubble_info = ((Builder)list).bubble_info;
      this.vip_banner = ((Builder)list).vip_banner;
      this.common_card = Message.immutableCopyOf(((Builder)list).common_card);
      this.custom_grid = Message.immutableCopyOf(((Builder)list).custom_grid);
      this.more_grid = Message.immutableCopyOf(((Builder)list).more_grid);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public AlaLiveInfo ala_live_info;
    
    public List<AlaLiveInfo> ala_live_record;
    
    public Anti anti_stat;
    
    public List<BannerImage> banner;
    
    public MemberBlockInfo block_info;
    
    public BubbleInfo bubble_info;
    
    public List<UcCardInfo> common_card;
    
    public List<ForumDynamic> concerned_forum_list;
    
    public List<CustomGrid> custom_grid;
    
    public List<DynamicInfo> dynamic_list;
    
    public Feedback feedback;
    
    public FinanceTab finance_tab;
    
    public GoodsWin goods_win;
    
    public Highlist highs;
    
    public Integer is_black_white;
    
    public ModuleInfo module_info;
    
    public List<CustomGrid> more_grid;
    
    public Namoaixud namoaixud;
    
    public NamoaixudEntry namoaixud_entry;
    
    public HotUserRankEntry new_god_rankinfo;
    
    public List<ThreadInfo> newest_dynamic_list;
    
    public NicknameInfo nickname_info;
    
    public List<PostInfoList> post_list;
    
    public List<SmartApp> recom_naws_list;
    
    public TAInfo tainfo;
    
    public TbBookrack tbbookrack;
    
    public UcCard uc_card;
    
    public String uk;
    
    public List<UserMap> url_map;
    
    public User user;
    
    public UserAgreeInfo user_agree_info;
    
    public UserGodInfo user_god_info;
    
    public UserManChannelInfo video_channel_info;
    
    public VipBanner vip_banner;
    
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
      this.recom_naws_list = Message.copyOf(param1DataRes.recom_naws_list);
      this.namoaixud = param1DataRes.namoaixud;
      this.newest_dynamic_list = Message.copyOf(param1DataRes.newest_dynamic_list);
      this.goods_win = param1DataRes.goods_win;
      this.new_god_rankinfo = param1DataRes.new_god_rankinfo;
      this.uk = param1DataRes.uk;
      this.is_black_white = param1DataRes.is_black_white;
      this.work_tab_id = param1DataRes.work_tab_id;
      this.finance_tab = param1DataRes.finance_tab;
      this.block_info = param1DataRes.block_info;
      this.namoaixud_entry = param1DataRes.namoaixud_entry;
      this.bubble_info = param1DataRes.bubble_info;
      this.vip_banner = param1DataRes.vip_banner;
      this.common_card = Message.copyOf(param1DataRes.common_card);
      this.custom_grid = Message.copyOf(param1DataRes.custom_grid);
      this.more_grid = Message.copyOf(param1DataRes.more_grid);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
