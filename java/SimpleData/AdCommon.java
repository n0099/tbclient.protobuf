package tbclient.SimpleData;

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
public final class AdCommon extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<BannerFlag> DEFAULT_FLAG_NAMES;
    public static final List<BrandImage> DEFAULT_IMAGES;
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_PARALLEL_CHARGE_URL = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2)
    public final Brand brand;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<BannerFlag> flag_names;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<BrandImage> images;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String parallel_charge_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Brand brand;
        public List flag_names;
        public List images;
        public String jump_url;
        public String parallel_charge_url;
        public String title;

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
        public Builder(AdCommon adCommon) {
            super(adCommon);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {adCommon};
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
            if (adCommon == null) {
                return;
            }
            this.title = adCommon.title;
            this.brand = adCommon.brand;
            this.images = Message.copyOf(adCommon.images);
            this.jump_url = adCommon.jump_url;
            this.parallel_charge_url = adCommon.parallel_charge_url;
            this.flag_names = Message.copyOf(adCommon.flag_names);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdCommon build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new AdCommon(this, z, null);
            }
            return (AdCommon) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-633886716, "Ltbclient/SimpleData/AdCommon;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-633886716, "Ltbclient/SimpleData/AdCommon;");
                return;
            }
        }
        DEFAULT_IMAGES = Collections.emptyList();
        DEFAULT_FLAG_NAMES = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdCommon(Builder builder, boolean z) {
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            this.brand = builder.brand;
            List list = builder.images;
            if (list == null) {
                this.images = DEFAULT_IMAGES;
            } else {
                this.images = Message.immutableCopyOf(list);
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            String str3 = builder.parallel_charge_url;
            if (str3 == null) {
                this.parallel_charge_url = "";
            } else {
                this.parallel_charge_url = str3;
            }
            List list2 = builder.flag_names;
            if (list2 == null) {
                this.flag_names = DEFAULT_FLAG_NAMES;
                return;
            } else {
                this.flag_names = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.title = builder.title;
        this.brand = builder.brand;
        this.images = Message.immutableCopyOf(builder.images);
        this.jump_url = builder.jump_url;
        this.parallel_charge_url = builder.parallel_charge_url;
        this.flag_names = Message.immutableCopyOf(builder.flag_names);
    }

    public /* synthetic */ AdCommon(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
