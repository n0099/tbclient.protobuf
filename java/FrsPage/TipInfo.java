package tbclient.FrsPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TipInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_TIP_INTERVAL = "";
    public static final String DEFAULT_TIP_NAME = "";
    public static final String DEFAULT_TIP_NOTICE = "";
    public static final String DEFAULT_TIP_POP = "";
    public static final String DEFAULT_TIP_POP_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tip_interval;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tip_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tip_notice;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tip_pop;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tip_pop_title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TipInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String tip_interval;
        public String tip_name;
        public String tip_notice;
        public String tip_pop;
        public String tip_pop_title;

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
        public Builder(TipInfo tipInfo) {
            super(tipInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tipInfo};
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
            if (tipInfo == null) {
                return;
            }
            this.tip_name = tipInfo.tip_name;
            this.tip_pop_title = tipInfo.tip_pop_title;
            this.tip_pop = tipInfo.tip_pop;
            this.tip_notice = tipInfo.tip_notice;
            this.tip_interval = tipInfo.tip_interval;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TipInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TipInfo(this, z, null) : (TipInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ TipInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.tip_name;
            if (str == null) {
                this.tip_name = "";
            } else {
                this.tip_name = str;
            }
            String str2 = builder.tip_pop_title;
            if (str2 == null) {
                this.tip_pop_title = "";
            } else {
                this.tip_pop_title = str2;
            }
            String str3 = builder.tip_pop;
            if (str3 == null) {
                this.tip_pop = "";
            } else {
                this.tip_pop = str3;
            }
            String str4 = builder.tip_notice;
            if (str4 == null) {
                this.tip_notice = "";
            } else {
                this.tip_notice = str4;
            }
            String str5 = builder.tip_interval;
            if (str5 == null) {
                this.tip_interval = "";
                return;
            } else {
                this.tip_interval = str5;
                return;
            }
        }
        this.tip_name = builder.tip_name;
        this.tip_pop_title = builder.tip_pop_title;
        this.tip_pop = builder.tip_pop;
        this.tip_notice = builder.tip_notice;
        this.tip_interval = builder.tip_interval;
    }
}
