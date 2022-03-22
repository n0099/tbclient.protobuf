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
/* loaded from: classes8.dex */
public final class AnchorInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_AUTHOR_ID;
    public static final String DEFAULT_AUTHOR_NAME = "";
    public static final String DEFAULT_FORUMNAME = "";
    public static final Integer DEFAULT_FROM_TYPE;
    public static final Long DEFAULT_GROUP_ID;
    public static final String DEFAULT_INTRO = "";
    public static final Integer DEFAULT_IS_VIP;
    public static final Integer DEFAULT_LABEL_ID;
    public static final String DEFAULT_LABEL_NAME = "";
    public static final Integer DEFAULT_LIKERS;
    public static final Integer DEFAULT_LISTENERS;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_PUBLISHERID;
    public static final String DEFAULT_PUBLISHERNAME = "";
    public static final String DEFAULT_PUBLISHERPORTRAIT = "";
    public static final Integer DEFAULT_START_TIME;
    public static final Integer DEFAULT_STATUS;
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String author_name;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String forumName;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer from_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long group_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_vip;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer label_id;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer likers;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer listeners;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 13, type = Message.Datatype.INT64)
    public final Long publisherId;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String publisherName;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String publisherPortrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer start_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 20)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AnchorInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long author_id;
        public String author_name;
        public String forumName;
        public Integer from_type;
        public Long group_id;
        public String intro;
        public Integer is_vip;
        public Integer label_id;
        public String label_name;
        public Integer likers;
        public Integer listeners;
        public String name;
        public String portrait;
        public Long publisherId;
        public String publisherName;
        public String publisherPortrait;
        public Integer start_time;
        public Integer status;
        public ZhiBoInfoTW twzhibo_info;
        public Integer type;

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
        public Builder(AnchorInfo anchorInfo) {
            super(anchorInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {anchorInfo};
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
            if (anchorInfo == null) {
                return;
            }
            this.portrait = anchorInfo.portrait;
            this.name = anchorInfo.name;
            this.start_time = anchorInfo.start_time;
            this.status = anchorInfo.status;
            this.author_id = anchorInfo.author_id;
            this.author_name = anchorInfo.author_name;
            this.listeners = anchorInfo.listeners;
            this.likers = anchorInfo.likers;
            this.group_id = anchorInfo.group_id;
            this.intro = anchorInfo.intro;
            this.publisherPortrait = anchorInfo.publisherPortrait;
            this.publisherName = anchorInfo.publisherName;
            this.publisherId = anchorInfo.publisherId;
            this.forumName = anchorInfo.forumName;
            this.from_type = anchorInfo.from_type;
            this.is_vip = anchorInfo.is_vip;
            this.label_id = anchorInfo.label_id;
            this.label_name = anchorInfo.label_name;
            this.type = anchorInfo.type;
            this.twzhibo_info = anchorInfo.twzhibo_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AnchorInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AnchorInfo(this, z, null) : (AnchorInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(48167022, "Ltbclient/AnchorInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(48167022, "Ltbclient/AnchorInfo;");
                return;
            }
        }
        DEFAULT_START_TIME = 0;
        DEFAULT_STATUS = 0;
        DEFAULT_AUTHOR_ID = 0L;
        DEFAULT_LISTENERS = 0;
        DEFAULT_LIKERS = 0;
        DEFAULT_GROUP_ID = 0L;
        DEFAULT_PUBLISHERID = 0L;
        DEFAULT_FROM_TYPE = 0;
        DEFAULT_IS_VIP = 0;
        DEFAULT_LABEL_ID = 0;
        DEFAULT_TYPE = 0;
    }

    public /* synthetic */ AnchorInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorInfo(Builder builder, boolean z) {
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
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            Integer num = builder.start_time;
            if (num == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num;
            }
            Integer num2 = builder.status;
            if (num2 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num2;
            }
            Long l = builder.author_id;
            if (l == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l;
            }
            String str3 = builder.author_name;
            if (str3 == null) {
                this.author_name = "";
            } else {
                this.author_name = str3;
            }
            Integer num3 = builder.listeners;
            if (num3 == null) {
                this.listeners = DEFAULT_LISTENERS;
            } else {
                this.listeners = num3;
            }
            Integer num4 = builder.likers;
            if (num4 == null) {
                this.likers = DEFAULT_LIKERS;
            } else {
                this.likers = num4;
            }
            Long l2 = builder.group_id;
            if (l2 == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = l2;
            }
            String str4 = builder.intro;
            if (str4 == null) {
                this.intro = "";
            } else {
                this.intro = str4;
            }
            String str5 = builder.publisherPortrait;
            if (str5 == null) {
                this.publisherPortrait = "";
            } else {
                this.publisherPortrait = str5;
            }
            String str6 = builder.publisherName;
            if (str6 == null) {
                this.publisherName = "";
            } else {
                this.publisherName = str6;
            }
            Long l3 = builder.publisherId;
            if (l3 == null) {
                this.publisherId = DEFAULT_PUBLISHERID;
            } else {
                this.publisherId = l3;
            }
            String str7 = builder.forumName;
            if (str7 == null) {
                this.forumName = "";
            } else {
                this.forumName = str7;
            }
            Integer num5 = builder.from_type;
            if (num5 == null) {
                this.from_type = DEFAULT_FROM_TYPE;
            } else {
                this.from_type = num5;
            }
            Integer num6 = builder.is_vip;
            if (num6 == null) {
                this.is_vip = DEFAULT_IS_VIP;
            } else {
                this.is_vip = num6;
            }
            Integer num7 = builder.label_id;
            if (num7 == null) {
                this.label_id = DEFAULT_LABEL_ID;
            } else {
                this.label_id = num7;
            }
            String str8 = builder.label_name;
            if (str8 == null) {
                this.label_name = "";
            } else {
                this.label_name = str8;
            }
            Integer num8 = builder.type;
            if (num8 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num8;
            }
            this.twzhibo_info = builder.twzhibo_info;
            return;
        }
        this.portrait = builder.portrait;
        this.name = builder.name;
        this.start_time = builder.start_time;
        this.status = builder.status;
        this.author_id = builder.author_id;
        this.author_name = builder.author_name;
        this.listeners = builder.listeners;
        this.likers = builder.likers;
        this.group_id = builder.group_id;
        this.intro = builder.intro;
        this.publisherPortrait = builder.publisherPortrait;
        this.publisherName = builder.publisherName;
        this.publisherId = builder.publisherId;
        this.forumName = builder.forumName;
        this.from_type = builder.from_type;
        this.is_vip = builder.is_vip;
        this.label_id = builder.label_id;
        this.label_name = builder.label_name;
        this.type = builder.type;
        this.twzhibo_info = builder.twzhibo_info;
    }
}
