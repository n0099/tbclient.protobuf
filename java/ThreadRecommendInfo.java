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
/* loaded from: classes9.dex */
public final class ThreadRecommendInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FORUM_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_JUMP_LINK = "";
    public static final String DEFAULT_RECOMMEND_ICON = "";
    public static final String DEFAULT_RECOMMEND_REASON = "";
    public static final String DEFAULT_RECOMMEND_TAIL = "";
    public static final String DEFAULT_RECOMMEND_TYPE = "";
    public static final Integer DEFAULT_SHOW_NUM;
    public static final String DEFAULT_SHOW_TYPE = "";
    public static final Long DEFAULT_TOPIC_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 13)
    public final ThemeColorInfo background_color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_avatar;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String jump_link;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String recommend_icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String recommend_reason;
    @ProtoField(tag = 11)
    public final ThemeColorInfo recommend_reason_color;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String recommend_tail;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String recommend_type;
    @ProtoField(tag = 10)
    public final ThemeColorInfo recommend_type_color;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer show_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String show_type;
    @ProtoField(tag = 12)
    public final ThemeColorInfo strip_color;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long topic_id;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThreadRecommendInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ThemeColorInfo background_color;
        public String forum_avatar;
        public String forum_name;
        public String jump_link;
        public String recommend_icon;
        public String recommend_reason;
        public ThemeColorInfo recommend_reason_color;
        public String recommend_tail;
        public String recommend_type;
        public ThemeColorInfo recommend_type_color;
        public Integer show_num;
        public String show_type;
        public ThemeColorInfo strip_color;
        public Long topic_id;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(ThreadRecommendInfo threadRecommendInfo) {
            super(threadRecommendInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {threadRecommendInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (threadRecommendInfo == null) {
                return;
            }
            this.forum_avatar = threadRecommendInfo.forum_avatar;
            this.forum_name = threadRecommendInfo.forum_name;
            this.show_num = threadRecommendInfo.show_num;
            this.show_type = threadRecommendInfo.show_type;
            this.recommend_reason = threadRecommendInfo.recommend_reason;
            this.topic_id = threadRecommendInfo.topic_id;
            this.recommend_type = threadRecommendInfo.recommend_type;
            this.recommend_tail = threadRecommendInfo.recommend_tail;
            this.recommend_icon = threadRecommendInfo.recommend_icon;
            this.recommend_type_color = threadRecommendInfo.recommend_type_color;
            this.recommend_reason_color = threadRecommendInfo.recommend_reason_color;
            this.strip_color = threadRecommendInfo.strip_color;
            this.background_color = threadRecommendInfo.background_color;
            this.jump_link = threadRecommendInfo.jump_link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadRecommendInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ThreadRecommendInfo(this, z, null);
            }
            return (ThreadRecommendInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-640137595, "Ltbclient/ThreadRecommendInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-640137595, "Ltbclient/ThreadRecommendInfo;");
                return;
            }
        }
        DEFAULT_SHOW_NUM = 0;
        DEFAULT_TOPIC_ID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadRecommendInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.forum_avatar;
            if (str == null) {
                this.forum_avatar = "";
            } else {
                this.forum_avatar = str;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            Integer num = builder.show_num;
            if (num == null) {
                this.show_num = DEFAULT_SHOW_NUM;
            } else {
                this.show_num = num;
            }
            String str3 = builder.show_type;
            if (str3 == null) {
                this.show_type = "";
            } else {
                this.show_type = str3;
            }
            String str4 = builder.recommend_reason;
            if (str4 == null) {
                this.recommend_reason = "";
            } else {
                this.recommend_reason = str4;
            }
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str5 = builder.recommend_type;
            if (str5 == null) {
                this.recommend_type = "";
            } else {
                this.recommend_type = str5;
            }
            String str6 = builder.recommend_tail;
            if (str6 == null) {
                this.recommend_tail = "";
            } else {
                this.recommend_tail = str6;
            }
            String str7 = builder.recommend_icon;
            if (str7 == null) {
                this.recommend_icon = "";
            } else {
                this.recommend_icon = str7;
            }
            this.recommend_type_color = builder.recommend_type_color;
            this.recommend_reason_color = builder.recommend_reason_color;
            this.strip_color = builder.strip_color;
            this.background_color = builder.background_color;
            String str8 = builder.jump_link;
            if (str8 == null) {
                this.jump_link = "";
                return;
            } else {
                this.jump_link = str8;
                return;
            }
        }
        this.forum_avatar = builder.forum_avatar;
        this.forum_name = builder.forum_name;
        this.show_num = builder.show_num;
        this.show_type = builder.show_type;
        this.recommend_reason = builder.recommend_reason;
        this.topic_id = builder.topic_id;
        this.recommend_type = builder.recommend_type;
        this.recommend_tail = builder.recommend_tail;
        this.recommend_icon = builder.recommend_icon;
        this.recommend_type_color = builder.recommend_type_color;
        this.recommend_reason_color = builder.recommend_reason_color;
        this.strip_color = builder.strip_color;
        this.background_color = builder.background_color;
        this.jump_link = builder.jump_link;
    }

    public /* synthetic */ ThreadRecommendInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
