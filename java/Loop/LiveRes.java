package tbclient.Loop;

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
/* loaded from: classes9.dex */
public final class LiveRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_IS_END = "";
    public static final List<YyLiveInfoSimple> DEFAULT_LIVE_LIST;
    public static final List<LiveNormalConfig> DEFAULT_NORMAL_CONFIG_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String is_end;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<YyLiveInfoSimple> live_list;
    @ProtoField(tag = 1)
    public final NormalConfig normal_config;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<LiveNormalConfig> normal_config_list;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String is_end;
        public List live_list;
        public NormalConfig normal_config;
        public List normal_config_list;

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
        public Builder(LiveRes liveRes) {
            super(liveRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {liveRes};
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
            if (liveRes == null) {
                return;
            }
            this.normal_config = liveRes.normal_config;
            this.live_list = Message.copyOf(liveRes.live_list);
            this.is_end = liveRes.is_end;
            this.normal_config_list = Message.copyOf(liveRes.normal_config_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LiveRes(this, z, null);
            }
            return (LiveRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-651913944, "Ltbclient/Loop/LiveRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-651913944, "Ltbclient/Loop/LiveRes;");
                return;
            }
        }
        DEFAULT_LIVE_LIST = Collections.emptyList();
        DEFAULT_NORMAL_CONFIG_LIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveRes(Builder builder, boolean z) {
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
            this.normal_config = builder.normal_config;
            List list = builder.live_list;
            if (list == null) {
                this.live_list = DEFAULT_LIVE_LIST;
            } else {
                this.live_list = Message.immutableCopyOf(list);
            }
            String str = builder.is_end;
            if (str == null) {
                this.is_end = "";
            } else {
                this.is_end = str;
            }
            List list2 = builder.normal_config_list;
            if (list2 == null) {
                this.normal_config_list = DEFAULT_NORMAL_CONFIG_LIST;
                return;
            } else {
                this.normal_config_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.normal_config = builder.normal_config;
        this.live_list = Message.immutableCopyOf(builder.live_list);
        this.is_end = builder.is_end;
        this.normal_config_list = Message.immutableCopyOf(builder.normal_config_list);
    }

    public /* synthetic */ LiveRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
