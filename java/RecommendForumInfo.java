package tbclient;

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
/* loaded from: classes10.dex */
public final class RecommendForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final String DEFAULT_AUTHEN = "";
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_AVATAR_ORIGIN = "";
    public static final List<PbContent> DEFAULT_CONTENT;
    public static final String DEFAULT_EXTRA = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_FORUM_TYPE;
    public static final Integer DEFAULT_HOT_NUM;
    public static final String DEFAULT_HOT_TEXT = "";
    public static final Long DEFAULT_HOT_THREAD_ID;
    public static final Integer DEFAULT_IS_BRAND_FORUM;
    public static final Integer DEFAULT_IS_LIKE;
    public static final Integer DEFAULT_IS_PRIVATE_FORUM;
    public static final String DEFAULT_LV1_NAME = "";
    public static final String DEFAULT_LV2_NAME = "";
    public static final Integer DEFAULT_MEMBER_COUNT;
    public static final String DEFAULT_RECOM_REASON = "";
    public static final String DEFAULT_SLOGAN = "";
    public static final String DEFAULT_SOURCE = "";
    public static final Integer DEFAULT_THREAD_COUNT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String authen;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String avatar_origin;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<PbContent> content;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String extra;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer forum_type;
    @ProtoField(tag = 21, type = Message.Datatype.INT32)
    public final Integer hot_num;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String hot_text;
    @ProtoField(tag = 22, type = Message.Datatype.UINT64)
    public final Long hot_thread_id;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_brand_forum;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_like;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer is_private_forum;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String lv1_name;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String lv2_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String recom_reason;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String source;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer thread_count;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<RecommendForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String abtest_tag;
        public String authen;
        public String avatar;
        public String avatar_origin;
        public List<PbContent> content;
        public String extra;
        public Long forum_id;
        public String forum_name;
        public Integer forum_type;
        public Integer hot_num;
        public String hot_text;
        public Long hot_thread_id;
        public Integer is_brand_forum;
        public Integer is_like;
        public Integer is_private_forum;
        public String lv1_name;
        public String lv2_name;
        public Integer member_count;
        public String recom_reason;
        public String slogan;
        public String source;
        public Integer thread_count;

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
        public Builder(RecommendForumInfo recommendForumInfo) {
            super(recommendForumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recommendForumInfo};
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
            if (recommendForumInfo == null) {
                return;
            }
            this.avatar = recommendForumInfo.avatar;
            this.forum_id = recommendForumInfo.forum_id;
            this.forum_name = recommendForumInfo.forum_name;
            this.is_like = recommendForumInfo.is_like;
            this.member_count = recommendForumInfo.member_count;
            this.thread_count = recommendForumInfo.thread_count;
            this.slogan = recommendForumInfo.slogan;
            this.content = Message.copyOf(recommendForumInfo.content);
            this.forum_type = recommendForumInfo.forum_type;
            this.authen = recommendForumInfo.authen;
            this.recom_reason = recommendForumInfo.recom_reason;
            this.is_brand_forum = recommendForumInfo.is_brand_forum;
            this.hot_text = recommendForumInfo.hot_text;
            this.abtest_tag = recommendForumInfo.abtest_tag;
            this.source = recommendForumInfo.source;
            this.extra = recommendForumInfo.extra;
            this.is_private_forum = recommendForumInfo.is_private_forum;
            this.lv1_name = recommendForumInfo.lv1_name;
            this.lv2_name = recommendForumInfo.lv2_name;
            this.avatar_origin = recommendForumInfo.avatar_origin;
            this.hot_num = recommendForumInfo.hot_num;
            this.hot_thread_id = recommendForumInfo.hot_thread_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new RecommendForumInfo(this, z, null) : (RecommendForumInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(727043422, "Ltbclient/RecommendForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(727043422, "Ltbclient/RecommendForumInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_IS_LIKE = 0;
        DEFAULT_MEMBER_COUNT = 0;
        DEFAULT_THREAD_COUNT = 0;
        DEFAULT_CONTENT = Collections.emptyList();
        DEFAULT_FORUM_TYPE = 0;
        DEFAULT_IS_BRAND_FORUM = 0;
        DEFAULT_IS_PRIVATE_FORUM = 0;
        DEFAULT_HOT_NUM = 0;
        DEFAULT_HOT_THREAD_ID = 0L;
    }

    public /* synthetic */ RecommendForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendForumInfo(Builder builder, boolean z) {
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
            String str = builder.avatar;
            if (str == null) {
                this.avatar = "";
            } else {
                this.avatar = str;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            Integer num2 = builder.member_count;
            if (num2 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num2;
            }
            Integer num3 = builder.thread_count;
            if (num3 == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
            } else {
                this.thread_count = num3;
            }
            String str3 = builder.slogan;
            if (str3 == null) {
                this.slogan = "";
            } else {
                this.slogan = str3;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Integer num4 = builder.forum_type;
            if (num4 == null) {
                this.forum_type = DEFAULT_FORUM_TYPE;
            } else {
                this.forum_type = num4;
            }
            String str4 = builder.authen;
            if (str4 == null) {
                this.authen = "";
            } else {
                this.authen = str4;
            }
            String str5 = builder.recom_reason;
            if (str5 == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = str5;
            }
            Integer num5 = builder.is_brand_forum;
            if (num5 == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
            } else {
                this.is_brand_forum = num5;
            }
            String str6 = builder.hot_text;
            if (str6 == null) {
                this.hot_text = "";
            } else {
                this.hot_text = str6;
            }
            String str7 = builder.abtest_tag;
            if (str7 == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = str7;
            }
            String str8 = builder.source;
            if (str8 == null) {
                this.source = "";
            } else {
                this.source = str8;
            }
            String str9 = builder.extra;
            if (str9 == null) {
                this.extra = "";
            } else {
                this.extra = str9;
            }
            Integer num6 = builder.is_private_forum;
            if (num6 == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
            } else {
                this.is_private_forum = num6;
            }
            String str10 = builder.lv1_name;
            if (str10 == null) {
                this.lv1_name = "";
            } else {
                this.lv1_name = str10;
            }
            String str11 = builder.lv2_name;
            if (str11 == null) {
                this.lv2_name = "";
            } else {
                this.lv2_name = str11;
            }
            String str12 = builder.avatar_origin;
            if (str12 == null) {
                this.avatar_origin = "";
            } else {
                this.avatar_origin = str12;
            }
            Integer num7 = builder.hot_num;
            if (num7 == null) {
                this.hot_num = DEFAULT_HOT_NUM;
            } else {
                this.hot_num = num7;
            }
            Long l2 = builder.hot_thread_id;
            if (l2 == null) {
                this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
                return;
            } else {
                this.hot_thread_id = l2;
                return;
            }
        }
        this.avatar = builder.avatar;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.is_like = builder.is_like;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
        this.slogan = builder.slogan;
        this.content = Message.immutableCopyOf(builder.content);
        this.forum_type = builder.forum_type;
        this.authen = builder.authen;
        this.recom_reason = builder.recom_reason;
        this.is_brand_forum = builder.is_brand_forum;
        this.hot_text = builder.hot_text;
        this.abtest_tag = builder.abtest_tag;
        this.source = builder.source;
        this.extra = builder.extra;
        this.is_private_forum = builder.is_private_forum;
        this.lv1_name = builder.lv1_name;
        this.lv2_name = builder.lv2_name;
        this.avatar_origin = builder.avatar_origin;
        this.hot_num = builder.hot_num;
        this.hot_thread_id = builder.hot_thread_id;
    }
}
