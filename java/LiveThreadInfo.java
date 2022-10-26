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
public final class LiveThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_FORUM_ID;
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_TITLE = "";
    public static final Long DEFAULT_USER_ID;
    public static final Long DEFAULT_USER_IP;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6)
    public final AlaLiveAttr ala_live_attr;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long user_ip;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public AlaLiveAttr ala_live_attr;
        public Long forum_id;
        public Long thread_id;
        public String title;
        public Long user_id;
        public Long user_ip;

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
        public Builder(LiveThreadInfo liveThreadInfo) {
            super(liveThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {liveThreadInfo};
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
            if (liveThreadInfo == null) {
                return;
            }
            this.forum_id = liveThreadInfo.forum_id;
            this.thread_id = liveThreadInfo.thread_id;
            this.title = liveThreadInfo.title;
            this.user_id = liveThreadInfo.user_id;
            this.user_ip = liveThreadInfo.user_ip;
            this.ala_live_attr = liveThreadInfo.ala_live_attr;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LiveThreadInfo(this, z, null);
            }
            return (LiveThreadInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-550466899, "Ltbclient/LiveThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-550466899, "Ltbclient/LiveThreadInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_USER_ID = 0L;
        DEFAULT_USER_IP = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveThreadInfo(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l3;
            }
            Long l4 = builder.user_ip;
            if (l4 == null) {
                this.user_ip = DEFAULT_USER_IP;
            } else {
                this.user_ip = l4;
            }
            this.ala_live_attr = builder.ala_live_attr;
            return;
        }
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
        this.title = builder.title;
        this.user_id = builder.user_id;
        this.user_ip = builder.user_ip;
        this.ala_live_attr = builder.ala_live_attr;
    }

    public /* synthetic */ LiveThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
