package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class CustomFigure extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BACKGROUND_TYPE = "";
    public static final String DEFAULT_BACKGROUND_VALUE = "";
    public static final String DEFAULT_DYNAMIC_FIGURE_URL = "";
    public static final String DEFAULT_FIGURE_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String background_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String background_value;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String dynamic_figure_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String figure_url;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CustomFigure> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String background_type;
        public String background_value;
        public String dynamic_figure_url;
        public String figure_url;

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
        public Builder(CustomFigure customFigure) {
            super(customFigure);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {customFigure};
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
            if (customFigure == null) {
                return;
            }
            this.figure_url = customFigure.figure_url;
            this.background_type = customFigure.background_type;
            this.background_value = customFigure.background_value;
            this.dynamic_figure_url = customFigure.dynamic_figure_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CustomFigure build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new CustomFigure(this, z, null);
            }
            return (CustomFigure) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFigure(Builder builder, boolean z) {
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
            String str = builder.figure_url;
            if (str == null) {
                this.figure_url = "";
            } else {
                this.figure_url = str;
            }
            String str2 = builder.background_type;
            if (str2 == null) {
                this.background_type = "";
            } else {
                this.background_type = str2;
            }
            String str3 = builder.background_value;
            if (str3 == null) {
                this.background_value = "";
            } else {
                this.background_value = str3;
            }
            String str4 = builder.dynamic_figure_url;
            if (str4 == null) {
                this.dynamic_figure_url = "";
                return;
            } else {
                this.dynamic_figure_url = str4;
                return;
            }
        }
        this.figure_url = builder.figure_url;
        this.background_type = builder.background_type;
        this.background_value = builder.background_value;
        this.dynamic_figure_url = builder.dynamic_figure_url;
    }

    public /* synthetic */ CustomFigure(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
