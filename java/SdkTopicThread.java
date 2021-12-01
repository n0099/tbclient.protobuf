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
/* loaded from: classes4.dex */
public final class SdkTopicThread extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_NEED_TOPIC;
    public static final String DEFAULT_PIC_URL = "";
    public static final Long DEFAULT_POST_NUM;
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_TITLE = "";
    public static final Long DEFAULT_ZAN_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer need_topic;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long zan_num;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<SdkTopicThread> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer need_topic;
        public String pic_url;
        public Long post_num;
        public Long tid;
        public String title;
        public Long zan_num;

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
        public Builder(SdkTopicThread sdkTopicThread) {
            super(sdkTopicThread);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {sdkTopicThread};
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
            if (sdkTopicThread == null) {
                return;
            }
            this.pic_url = sdkTopicThread.pic_url;
            this.title = sdkTopicThread.title;
            this.post_num = sdkTopicThread.post_num;
            this.zan_num = sdkTopicThread.zan_num;
            this.tid = sdkTopicThread.tid;
            this.need_topic = sdkTopicThread.need_topic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SdkTopicThread build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SdkTopicThread(this, z, null) : (SdkTopicThread) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-770811278, "Ltbclient/SdkTopicThread;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-770811278, "Ltbclient/SdkTopicThread;");
                return;
            }
        }
        DEFAULT_POST_NUM = 0L;
        DEFAULT_ZAN_NUM = 0L;
        DEFAULT_TID = 0L;
        DEFAULT_NEED_TOPIC = 0;
    }

    public /* synthetic */ SdkTopicThread(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkTopicThread(Builder builder, boolean z) {
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
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            Long l = builder.post_num;
            if (l == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l;
            }
            Long l2 = builder.zan_num;
            if (l2 == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = l2;
            }
            Long l3 = builder.tid;
            if (l3 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l3;
            }
            Integer num = builder.need_topic;
            if (num == null) {
                this.need_topic = DEFAULT_NEED_TOPIC;
                return;
            } else {
                this.need_topic = num;
                return;
            }
        }
        this.pic_url = builder.pic_url;
        this.title = builder.title;
        this.post_num = builder.post_num;
        this.zan_num = builder.zan_num;
        this.tid = builder.tid;
        this.need_topic = builder.need_topic;
    }
}
