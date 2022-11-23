package tbclient.GetRecentWatchRecord;

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
import tbclient.LiveThreadInfo;
/* loaded from: classes9.dex */
public final class RecordUserInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_IS_FOLLOW;
    public static final Long DEFAULT_LAST_WATCH_TIME;
    public static final List<Tag> DEFAULT_TAGS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_follow;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long last_watch_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Tag> tags;
    @ProtoField(tag = 6)
    public final LiveThreadInfo thread_info;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecordUserInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_follow;
        public Long last_watch_time;
        public List<Tag> tags;
        public LiveThreadInfo thread_info;

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
        public Builder(RecordUserInfo recordUserInfo) {
            super(recordUserInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recordUserInfo};
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
            if (recordUserInfo == null) {
                return;
            }
            this.tags = Message.copyOf(recordUserInfo.tags);
            this.is_follow = recordUserInfo.is_follow;
            this.last_watch_time = recordUserInfo.last_watch_time;
            this.thread_info = recordUserInfo.thread_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecordUserInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new RecordUserInfo(this, z, null);
            }
            return (RecordUserInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(444994715, "Ltbclient/GetRecentWatchRecord/RecordUserInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(444994715, "Ltbclient/GetRecentWatchRecord/RecordUserInfo;");
                return;
            }
        }
        DEFAULT_TAGS = Collections.emptyList();
        DEFAULT_IS_FOLLOW = 0;
        DEFAULT_LAST_WATCH_TIME = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordUserInfo(Builder builder, boolean z) {
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
            List<Tag> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list);
            }
            Integer num = builder.is_follow;
            if (num == null) {
                this.is_follow = DEFAULT_IS_FOLLOW;
            } else {
                this.is_follow = num;
            }
            Long l = builder.last_watch_time;
            if (l == null) {
                this.last_watch_time = DEFAULT_LAST_WATCH_TIME;
            } else {
                this.last_watch_time = l;
            }
            this.thread_info = builder.thread_info;
            return;
        }
        this.tags = Message.immutableCopyOf(builder.tags);
        this.is_follow = builder.is_follow;
        this.last_watch_time = builder.last_watch_time;
        this.thread_info = builder.thread_info;
    }

    public /* synthetic */ RecordUserInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
