package tbclient.NewHottopic;

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
import tbclient.ThreadInfo;
/* loaded from: classes4.dex */
public final class TopicThread extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_FEED_ID;
    public static final Integer DEFAULT_SOURCE;
    public static final Integer DEFAULT_USER_AGREE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long feed_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer source;
    @ProtoField(tag = 2)
    public final ThreadInfo thread_info;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_agree;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<TopicThread> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long feed_id;
        public Integer source;
        public ThreadInfo thread_info;
        public Integer user_agree;

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
        public Builder(TopicThread topicThread) {
            super(topicThread);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {topicThread};
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
            if (topicThread == null) {
                return;
            }
            this.feed_id = topicThread.feed_id;
            this.thread_info = topicThread.thread_info;
            this.user_agree = topicThread.user_agree;
            this.source = topicThread.source;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicThread build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TopicThread(this, z, null) : (TopicThread) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-584951687, "Ltbclient/NewHottopic/TopicThread;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-584951687, "Ltbclient/NewHottopic/TopicThread;");
                return;
            }
        }
        DEFAULT_FEED_ID = 0L;
        DEFAULT_USER_AGREE = 0;
        DEFAULT_SOURCE = 0;
    }

    public /* synthetic */ TopicThread(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicThread(Builder builder, boolean z) {
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
            Long l = builder.feed_id;
            if (l == null) {
                this.feed_id = DEFAULT_FEED_ID;
            } else {
                this.feed_id = l;
            }
            this.thread_info = builder.thread_info;
            Integer num = builder.user_agree;
            if (num == null) {
                this.user_agree = DEFAULT_USER_AGREE;
            } else {
                this.user_agree = num;
            }
            Integer num2 = builder.source;
            if (num2 == null) {
                this.source = DEFAULT_SOURCE;
                return;
            } else {
                this.source = num2;
                return;
            }
        }
        this.feed_id = builder.feed_id;
        this.thread_info = builder.thread_info;
        this.user_agree = builder.user_agree;
        this.source = builder.source;
    }
}
