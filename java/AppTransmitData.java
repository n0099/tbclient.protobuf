package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class AppTransmitData extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_WISE_SAMPLE_ID = "";
    public static final String DEFAULT_YY_HDID = "";
    public static final String DEFAULT_YY_VERSION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String wise_sample_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String yy_hdid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String yy_version;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<AppTransmitData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String wise_sample_id;
        public String yy_hdid;
        public String yy_version;

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
        public Builder(AppTransmitData appTransmitData) {
            super(appTransmitData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {appTransmitData};
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
            if (appTransmitData == null) {
                return;
            }
            this.wise_sample_id = appTransmitData.wise_sample_id;
            this.yy_hdid = appTransmitData.yy_hdid;
            this.yy_version = appTransmitData.yy_version;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppTransmitData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AppTransmitData(this, z, null) : (AppTransmitData) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ AppTransmitData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppTransmitData(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.wise_sample_id;
            if (str == null) {
                this.wise_sample_id = "";
            } else {
                this.wise_sample_id = str;
            }
            String str2 = builder.yy_hdid;
            if (str2 == null) {
                this.yy_hdid = "";
            } else {
                this.yy_hdid = str2;
            }
            String str3 = builder.yy_version;
            if (str3 == null) {
                this.yy_version = "";
                return;
            } else {
                this.yy_version = str3;
                return;
            }
        }
        this.wise_sample_id = builder.wise_sample_id;
        this.yy_hdid = builder.yy_hdid;
        this.yy_version = builder.yy_version;
    }
}
