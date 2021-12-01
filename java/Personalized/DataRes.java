package tbclient.Personalized;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActiveCenter;
import tbclient.Anti;
import tbclient.BannerList;
import tbclient.DiscoverHotForum;
import tbclient.SimpleForum;
import tbclient.ThreadInfo;
/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<CardForum> DEFAULT_CARD_FORUM;
    public static final List<CardGod> DEFAULT_CARD_GOD;
    public static final List<CardTopic> DEFAULT_CARD_TOPIC;
    public static final Integer DEFAULT_FRESH_CTRL_NUM;
    public static final List<TagStruct> DEFAULT_INTERESTION;
    public static final Integer DEFAULT_IS_NEW_URL;
    public static final List<SimpleForum> DEFAULT_LIKE_FORUMS;
    public static final List<Resource> DEFAULT_RESOURCE_LIST;
    public static final String DEFAULT_STAT_KEY = "";
    public static final Integer DEFAULT_STYLE_AB_TAG;
    public static final Integer DEFAULT_SUG_SECONDS;
    public static final List<TagInfo> DEFAULT_TAG_LIST;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public static final List<ThreadPersonalized> DEFAULT_THREAD_PERSONALIZED;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 22)
    public final ActiveCenter active_center;
    @ProtoField(tag = 10)
    public final AgeSexModule age_sex;
    @ProtoField(tag = 16)
    public final Anti anti;
    @ProtoField(tag = 9)
    public final BannerList banner_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<CardForum> card_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<CardGod> card_god;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<CardTopic> card_topic;
    @ProtoField(tag = 18)
    public final FloatInfo float_info;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer fresh_ctrl_num;
    @ProtoField(tag = 23)
    public final DiscoverHotForum hot_recomforum;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<TagStruct> interestion;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<SimpleForum> like_forums;
    @ProtoField(tag = 17)
    public final LiveAnswer live_answer;
    @ProtoField(tag = 19)
    public final RecomPostTopic recom_post_topic;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Resource> resource_list;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String stat_key;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer style_ab_tag;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer sug_seconds;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TagInfo> tag_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadPersonalized> thread_personalized;
    @ProtoField(tag = 20)
    public final UserFollowLive user_follow_live;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ActiveCenter active_center;
        public AgeSexModule age_sex;
        public Anti anti;
        public BannerList banner_list;
        public List<CardForum> card_forum;
        public List<CardGod> card_god;
        public List<CardTopic> card_topic;
        public FloatInfo float_info;
        public Integer fresh_ctrl_num;
        public DiscoverHotForum hot_recomforum;
        public List<TagStruct> interestion;
        public Integer is_new_url;
        public List<SimpleForum> like_forums;
        public LiveAnswer live_answer;
        public RecomPostTopic recom_post_topic;
        public List<Resource> resource_list;
        public String stat_key;
        public Integer style_ab_tag;
        public Integer sug_seconds;
        public List<TagInfo> tag_list;
        public List<ThreadInfo> thread_list;
        public List<ThreadPersonalized> thread_personalized;
        public UserFollowLive user_follow_live;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (dataRes == null) {
                return;
            }
            this.tag_list = Message.copyOf(dataRes.tag_list);
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.resource_list = Message.copyOf(dataRes.resource_list);
            this.card_forum = Message.copyOf(dataRes.card_forum);
            this.card_topic = Message.copyOf(dataRes.card_topic);
            this.sug_seconds = dataRes.sug_seconds;
            this.thread_personalized = Message.copyOf(dataRes.thread_personalized);
            this.is_new_url = dataRes.is_new_url;
            this.banner_list = dataRes.banner_list;
            this.age_sex = dataRes.age_sex;
            this.interestion = Message.copyOf(dataRes.interestion);
            this.card_god = Message.copyOf(dataRes.card_god);
            this.stat_key = dataRes.stat_key;
            this.like_forums = Message.copyOf(dataRes.like_forums);
            this.style_ab_tag = dataRes.style_ab_tag;
            this.anti = dataRes.anti;
            this.live_answer = dataRes.live_answer;
            this.float_info = dataRes.float_info;
            this.recom_post_topic = dataRes.recom_post_topic;
            this.user_follow_live = dataRes.user_follow_live;
            this.fresh_ctrl_num = dataRes.fresh_ctrl_num;
            this.active_center = dataRes.active_center;
            this.hot_recomforum = dataRes.hot_recomforum;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-397390022, "Ltbclient/Personalized/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-397390022, "Ltbclient/Personalized/DataRes;");
                return;
            }
        }
        DEFAULT_TAG_LIST = Collections.emptyList();
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_RESOURCE_LIST = Collections.emptyList();
        DEFAULT_CARD_FORUM = Collections.emptyList();
        DEFAULT_CARD_TOPIC = Collections.emptyList();
        DEFAULT_SUG_SECONDS = 0;
        DEFAULT_THREAD_PERSONALIZED = Collections.emptyList();
        DEFAULT_IS_NEW_URL = 0;
        DEFAULT_INTERESTION = Collections.emptyList();
        DEFAULT_CARD_GOD = Collections.emptyList();
        DEFAULT_LIKE_FORUMS = Collections.emptyList();
        DEFAULT_STYLE_AB_TAG = 0;
        DEFAULT_FRESH_CTRL_NUM = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            List<TagInfo> list = builder.tag_list;
            if (list == null) {
                this.tag_list = DEFAULT_TAG_LIST;
            } else {
                this.tag_list = Message.immutableCopyOf(list);
            }
            List<ThreadInfo> list2 = builder.thread_list;
            if (list2 == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list2);
            }
            List<Resource> list3 = builder.resource_list;
            if (list3 == null) {
                this.resource_list = DEFAULT_RESOURCE_LIST;
            } else {
                this.resource_list = Message.immutableCopyOf(list3);
            }
            List<CardForum> list4 = builder.card_forum;
            if (list4 == null) {
                this.card_forum = DEFAULT_CARD_FORUM;
            } else {
                this.card_forum = Message.immutableCopyOf(list4);
            }
            List<CardTopic> list5 = builder.card_topic;
            if (list5 == null) {
                this.card_topic = DEFAULT_CARD_TOPIC;
            } else {
                this.card_topic = Message.immutableCopyOf(list5);
            }
            Integer num = builder.sug_seconds;
            if (num == null) {
                this.sug_seconds = DEFAULT_SUG_SECONDS;
            } else {
                this.sug_seconds = num;
            }
            List<ThreadPersonalized> list6 = builder.thread_personalized;
            if (list6 == null) {
                this.thread_personalized = DEFAULT_THREAD_PERSONALIZED;
            } else {
                this.thread_personalized = Message.immutableCopyOf(list6);
            }
            Integer num2 = builder.is_new_url;
            if (num2 == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = num2;
            }
            this.banner_list = builder.banner_list;
            this.age_sex = builder.age_sex;
            List<TagStruct> list7 = builder.interestion;
            if (list7 == null) {
                this.interestion = DEFAULT_INTERESTION;
            } else {
                this.interestion = Message.immutableCopyOf(list7);
            }
            List<CardGod> list8 = builder.card_god;
            if (list8 == null) {
                this.card_god = DEFAULT_CARD_GOD;
            } else {
                this.card_god = Message.immutableCopyOf(list8);
            }
            String str = builder.stat_key;
            if (str == null) {
                this.stat_key = "";
            } else {
                this.stat_key = str;
            }
            List<SimpleForum> list9 = builder.like_forums;
            if (list9 == null) {
                this.like_forums = DEFAULT_LIKE_FORUMS;
            } else {
                this.like_forums = Message.immutableCopyOf(list9);
            }
            Integer num3 = builder.style_ab_tag;
            if (num3 == null) {
                this.style_ab_tag = DEFAULT_STYLE_AB_TAG;
            } else {
                this.style_ab_tag = num3;
            }
            this.anti = builder.anti;
            this.live_answer = builder.live_answer;
            this.float_info = builder.float_info;
            this.recom_post_topic = builder.recom_post_topic;
            this.user_follow_live = builder.user_follow_live;
            Integer num4 = builder.fresh_ctrl_num;
            if (num4 == null) {
                this.fresh_ctrl_num = DEFAULT_FRESH_CTRL_NUM;
            } else {
                this.fresh_ctrl_num = num4;
            }
            this.active_center = builder.active_center;
            this.hot_recomforum = builder.hot_recomforum;
            return;
        }
        this.tag_list = Message.immutableCopyOf(builder.tag_list);
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.resource_list = Message.immutableCopyOf(builder.resource_list);
        this.card_forum = Message.immutableCopyOf(builder.card_forum);
        this.card_topic = Message.immutableCopyOf(builder.card_topic);
        this.sug_seconds = builder.sug_seconds;
        this.thread_personalized = Message.immutableCopyOf(builder.thread_personalized);
        this.is_new_url = builder.is_new_url;
        this.banner_list = builder.banner_list;
        this.age_sex = builder.age_sex;
        this.interestion = Message.immutableCopyOf(builder.interestion);
        this.card_god = Message.immutableCopyOf(builder.card_god);
        this.stat_key = builder.stat_key;
        this.like_forums = Message.immutableCopyOf(builder.like_forums);
        this.style_ab_tag = builder.style_ab_tag;
        this.anti = builder.anti;
        this.live_answer = builder.live_answer;
        this.float_info = builder.float_info;
        this.recom_post_topic = builder.recom_post_topic;
        this.user_follow_live = builder.user_follow_live;
        this.fresh_ctrl_num = builder.fresh_ctrl_num;
        this.active_center = builder.active_center;
        this.hot_recomforum = builder.hot_recomforum;
    }
}
