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
public final class LivePreviewInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_COVER = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Long DEFAULT_LIVE_ID;
    public static final Long DEFAULT_PREVIEW_ID;
    public static final Integer DEFAULT_START_TIME;
    public static final Integer DEFAULT_STATUS;
    public static final Long DEFAULT_SUBSCRIBE_ID;
    public static final Integer DEFAULT_SUBSCRIBE_STATUS;
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_TITLE = "";
    public static final Long DEFAULT_USER_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String cover;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long preview_id;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer start_time;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long subscribe_id;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer subscribe_status;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long user_id;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LivePreviewInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String cover;
        public String description;
        public Long live_id;
        public Long preview_id;
        public Integer start_time;
        public Integer status;
        public Long subscribe_id;
        public Integer subscribe_status;
        public Long thread_id;
        public String title;
        public Long user_id;

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
        public Builder(LivePreviewInfo livePreviewInfo) {
            super(livePreviewInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {livePreviewInfo};
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
            if (livePreviewInfo == null) {
                return;
            }
            this.preview_id = livePreviewInfo.preview_id;
            this.thread_id = livePreviewInfo.thread_id;
            this.user_id = livePreviewInfo.user_id;
            this.cover = livePreviewInfo.cover;
            this.title = livePreviewInfo.title;
            this.description = livePreviewInfo.description;
            this.status = livePreviewInfo.status;
            this.start_time = livePreviewInfo.start_time;
            this.live_id = livePreviewInfo.live_id;
            this.subscribe_id = livePreviewInfo.subscribe_id;
            this.subscribe_status = livePreviewInfo.subscribe_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LivePreviewInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LivePreviewInfo(this, z, null);
            }
            return (LivePreviewInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-364740005, "Ltbclient/LivePreviewInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-364740005, "Ltbclient/LivePreviewInfo;");
                return;
            }
        }
        DEFAULT_PREVIEW_ID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_USER_ID = 0L;
        DEFAULT_STATUS = 0;
        DEFAULT_START_TIME = 0;
        DEFAULT_LIVE_ID = 0L;
        DEFAULT_SUBSCRIBE_ID = 0L;
        DEFAULT_SUBSCRIBE_STATUS = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePreviewInfo(Builder builder, boolean z) {
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
            Long l = builder.preview_id;
            if (l == null) {
                this.preview_id = DEFAULT_PREVIEW_ID;
            } else {
                this.preview_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l3;
            }
            String str = builder.cover;
            if (str == null) {
                this.cover = "";
            } else {
                this.cover = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.description;
            if (str3 == null) {
                this.description = "";
            } else {
                this.description = str3;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.start_time;
            if (num2 == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num2;
            }
            Long l4 = builder.live_id;
            if (l4 == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l4;
            }
            Long l5 = builder.subscribe_id;
            if (l5 == null) {
                this.subscribe_id = DEFAULT_SUBSCRIBE_ID;
            } else {
                this.subscribe_id = l5;
            }
            Integer num3 = builder.subscribe_status;
            if (num3 == null) {
                this.subscribe_status = DEFAULT_SUBSCRIBE_STATUS;
                return;
            } else {
                this.subscribe_status = num3;
                return;
            }
        }
        this.preview_id = builder.preview_id;
        this.thread_id = builder.thread_id;
        this.user_id = builder.user_id;
        this.cover = builder.cover;
        this.title = builder.title;
        this.description = builder.description;
        this.status = builder.status;
        this.start_time = builder.start_time;
        this.live_id = builder.live_id;
        this.subscribe_id = builder.subscribe_id;
        this.subscribe_status = builder.subscribe_status;
    }

    public /* synthetic */ LivePreviewInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
