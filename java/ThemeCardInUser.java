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
/* loaded from: classes5.dex */
public final class ThemeCardInUser extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_COORDINATE = "";
    public static final String DEFAULT_IMG_ANDROID = "";
    public static final String DEFAULT_IMG_IOS = "";
    public static final Integer DEFAULT_LEVEL;
    public static final Long DEFAULT_PROPS_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String coordinate;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_android;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_ios;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer level;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long props_id;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<ThemeCardInUser> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String coordinate;
        public String img_android;
        public String img_ios;
        public Integer level;
        public Long props_id;

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
        public Builder(ThemeCardInUser themeCardInUser) {
            super(themeCardInUser);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {themeCardInUser};
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
            if (themeCardInUser == null) {
                return;
            }
            this.props_id = themeCardInUser.props_id;
            this.img_ios = themeCardInUser.img_ios;
            this.coordinate = themeCardInUser.coordinate;
            this.img_android = themeCardInUser.img_android;
            this.level = themeCardInUser.level;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeCardInUser build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ThemeCardInUser(this, z, null) : (ThemeCardInUser) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1533901276, "Ltbclient/ThemeCardInUser;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1533901276, "Ltbclient/ThemeCardInUser;");
                return;
            }
        }
        DEFAULT_PROPS_ID = 0L;
        DEFAULT_LEVEL = 0;
    }

    public /* synthetic */ ThemeCardInUser(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeCardInUser(Builder builder, boolean z) {
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
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = l;
            }
            String str = builder.img_ios;
            if (str == null) {
                this.img_ios = "";
            } else {
                this.img_ios = str;
            }
            String str2 = builder.coordinate;
            if (str2 == null) {
                this.coordinate = "";
            } else {
                this.coordinate = str2;
            }
            String str3 = builder.img_android;
            if (str3 == null) {
                this.img_android = "";
            } else {
                this.img_android = str3;
            }
            Integer num = builder.level;
            if (num == null) {
                this.level = DEFAULT_LEVEL;
                return;
            } else {
                this.level = num;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.img_ios = builder.img_ios;
        this.coordinate = builder.coordinate;
        this.img_android = builder.img_android;
        this.level = builder.level;
    }
}
