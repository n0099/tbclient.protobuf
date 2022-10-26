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
public final class IconStampInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_STAMP_TEXT = "";
    public static final String DEFAULT_STAMP_TITLE = "";
    public static final Integer DEFAULT_STAMP_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String stamp_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String stamp_title;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer stamp_type;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String stamp_text;
        public String stamp_title;
        public Integer stamp_type;

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
        public Builder(IconStampInfo iconStampInfo) {
            super(iconStampInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {iconStampInfo};
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
            if (iconStampInfo == null) {
                return;
            }
            this.stamp_title = iconStampInfo.stamp_title;
            this.stamp_text = iconStampInfo.stamp_text;
            this.stamp_type = iconStampInfo.stamp_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public IconStampInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new IconStampInfo(this, z, null);
            }
            return (IconStampInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-904582131, "Ltbclient/IconStampInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-904582131, "Ltbclient/IconStampInfo;");
                return;
            }
        }
        DEFAULT_STAMP_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconStampInfo(Builder builder, boolean z) {
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
            String str = builder.stamp_title;
            if (str == null) {
                this.stamp_title = "";
            } else {
                this.stamp_title = str;
            }
            String str2 = builder.stamp_text;
            if (str2 == null) {
                this.stamp_text = "";
            } else {
                this.stamp_text = str2;
            }
            Integer num = builder.stamp_type;
            if (num == null) {
                this.stamp_type = DEFAULT_STAMP_TYPE;
                return;
            } else {
                this.stamp_type = num;
                return;
            }
        }
        this.stamp_title = builder.stamp_title;
        this.stamp_text = builder.stamp_text;
        this.stamp_type = builder.stamp_type;
    }

    public /* synthetic */ IconStampInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
