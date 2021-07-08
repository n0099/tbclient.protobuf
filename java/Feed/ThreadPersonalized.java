package tbclient.Feed;

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
public final class ThreadPersonalized extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final String DEFAULT_EXTRA = "";
    public static final String DEFAULT_SOURCE = "";
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_WEIGHT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String extra;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String source;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String weight;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThreadPersonalized> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String abtest_tag;
        public String extra;
        public String source;
        public Long tid;
        public String weight;

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
        public Builder(ThreadPersonalized threadPersonalized) {
            super(threadPersonalized);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {threadPersonalized};
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
            if (threadPersonalized == null) {
                return;
            }
            this.tid = threadPersonalized.tid;
            this.weight = threadPersonalized.weight;
            this.source = threadPersonalized.source;
            this.abtest_tag = threadPersonalized.abtest_tag;
            this.extra = threadPersonalized.extra;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadPersonalized build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ThreadPersonalized(this, z, null) : (ThreadPersonalized) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-350376614, "Ltbclient/Feed/ThreadPersonalized;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-350376614, "Ltbclient/Feed/ThreadPersonalized;");
                return;
            }
        }
        DEFAULT_TID = 0L;
    }

    public /* synthetic */ ThreadPersonalized(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadPersonalized(Builder builder, boolean z) {
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
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.weight;
            if (str == null) {
                this.weight = "";
            } else {
                this.weight = str;
            }
            String str2 = builder.source;
            if (str2 == null) {
                this.source = "";
            } else {
                this.source = str2;
            }
            String str3 = builder.abtest_tag;
            if (str3 == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = str3;
            }
            String str4 = builder.extra;
            if (str4 == null) {
                this.extra = "";
                return;
            } else {
                this.extra = str4;
                return;
            }
        }
        this.tid = builder.tid;
        this.weight = builder.weight;
        this.source = builder.source;
        this.abtest_tag = builder.abtest_tag;
        this.extra = builder.extra;
    }
}
