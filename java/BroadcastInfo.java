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
/* loaded from: classes5.dex */
public final class BroadcastInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_AUDIT_STATUS;
    public static final Long DEFAULT_BCAST_ID;
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_CTR = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final Integer DEFAULT_PUBLISH_TIME;
    public static final Integer DEFAULT_PUSHUSER_CNT;
    public static final Integer DEFAULT_PV;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long bcast_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ctr;
    @ProtoField(tag = 5)
    public final RecommendForumInfo forum_info;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer pushuser_cnt;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer pv;
    @ProtoField(tag = 10)
    public final ThreadInfo thread_infos;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<BroadcastInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer audit_status;
        public Long bcast_id;
        public String content;
        public String ctr;
        public RecommendForumInfo forum_info;
        public String pic_url;
        public Integer publish_time;
        public Integer pushuser_cnt;
        public Integer pv;
        public ThreadInfo thread_infos;
        public String title;

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
        public Builder(BroadcastInfo broadcastInfo) {
            super(broadcastInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {broadcastInfo};
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
            if (broadcastInfo == null) {
                return;
            }
            this.bcast_id = broadcastInfo.bcast_id;
            this.title = broadcastInfo.title;
            this.content = broadcastInfo.content;
            this.forum_info = broadcastInfo.forum_info;
            this.publish_time = broadcastInfo.publish_time;
            this.pushuser_cnt = broadcastInfo.pushuser_cnt;
            this.pv = broadcastInfo.pv;
            this.ctr = broadcastInfo.ctr;
            this.thread_infos = broadcastInfo.thread_infos;
            this.audit_status = broadcastInfo.audit_status;
            this.pic_url = broadcastInfo.pic_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BroadcastInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BroadcastInfo(this, z, null) : (BroadcastInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1415389066, "Ltbclient/BroadcastInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1415389066, "Ltbclient/BroadcastInfo;");
                return;
            }
        }
        DEFAULT_BCAST_ID = 0L;
        DEFAULT_PUBLISH_TIME = 0;
        DEFAULT_PUSHUSER_CNT = 0;
        DEFAULT_PV = 0;
        DEFAULT_AUDIT_STATUS = 0;
    }

    public /* synthetic */ BroadcastInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastInfo(Builder builder, boolean z) {
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
            Long l = builder.bcast_id;
            if (l == null) {
                this.bcast_id = DEFAULT_BCAST_ID;
            } else {
                this.bcast_id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            this.forum_info = builder.forum_info;
            Integer num = builder.publish_time;
            if (num == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = num;
            }
            Integer num2 = builder.pushuser_cnt;
            if (num2 == null) {
                this.pushuser_cnt = DEFAULT_PUSHUSER_CNT;
            } else {
                this.pushuser_cnt = num2;
            }
            Integer num3 = builder.pv;
            if (num3 == null) {
                this.pv = DEFAULT_PV;
            } else {
                this.pv = num3;
            }
            String str3 = builder.ctr;
            if (str3 == null) {
                this.ctr = "";
            } else {
                this.ctr = str3;
            }
            this.thread_infos = builder.thread_infos;
            Integer num4 = builder.audit_status;
            if (num4 == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = num4;
            }
            String str4 = builder.pic_url;
            if (str4 == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = str4;
                return;
            }
        }
        this.bcast_id = builder.bcast_id;
        this.title = builder.title;
        this.content = builder.content;
        this.forum_info = builder.forum_info;
        this.publish_time = builder.publish_time;
        this.pushuser_cnt = builder.pushuser_cnt;
        this.pv = builder.pv;
        this.ctr = builder.ctr;
        this.thread_infos = builder.thread_infos;
        this.audit_status = builder.audit_status;
        this.pic_url = builder.pic_url;
    }
}
