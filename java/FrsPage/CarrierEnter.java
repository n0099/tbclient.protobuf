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
public final class CarrierEnter extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_HEADLINE_COVER = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String headline_cover;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String obj_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CarrierEnter> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String headline_cover;
        public String obj_id;
        public String text;
        public String title;
        public String url;

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
        public Builder(CarrierEnter carrierEnter) {
            super(carrierEnter);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {carrierEnter};
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
            if (carrierEnter == null) {
                return;
            }
            this.title = carrierEnter.title;
            this.text = carrierEnter.text;
            this.headline_cover = carrierEnter.headline_cover;
            this.url = carrierEnter.url;
            this.obj_id = carrierEnter.obj_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CarrierEnter build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new CarrierEnter(this, z, null) : (CarrierEnter) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ CarrierEnter(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarrierEnter(Builder builder, boolean z) {
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.text;
            if (str2 == null) {
                this.text = "";
            } else {
                this.text = str2;
            }
            String str3 = builder.headline_cover;
            if (str3 == null) {
                this.headline_cover = "";
            } else {
                this.headline_cover = str3;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
            } else {
                this.url = str4;
            }
            String str5 = builder.obj_id;
            if (str5 == null) {
                this.obj_id = "";
                return;
            } else {
                this.obj_id = str5;
                return;
            }
        }
        this.title = builder.title;
        this.text = builder.text;
        this.headline_cover = builder.headline_cover;
        this.url = builder.url;
        this.obj_id = builder.obj_id;
    }
}
