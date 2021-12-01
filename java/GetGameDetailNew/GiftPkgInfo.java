package tbclient.GetGameDetailNew;

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
/* loaded from: classes4.dex */
public final class GiftPkgInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ACQUIRE_NUM;
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_CORNER_MARK = "";
    public static final String DEFAULT_GIFTPKG_NAME = "";
    public static final String DEFAULT_GIFTPKG_URL = "";
    public static final String DEFAULT_THUMBNAILS = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long acquire_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String corner_mark;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String giftpkg_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String giftpkg_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String thumbnails;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GiftPkgInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long acquire_num;
        public String button_text;
        public String corner_mark;
        public String giftpkg_name;
        public String giftpkg_url;
        public String thumbnails;

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
        public Builder(GiftPkgInfo giftPkgInfo) {
            super(giftPkgInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {giftPkgInfo};
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
            if (giftPkgInfo == null) {
                return;
            }
            this.giftpkg_name = giftPkgInfo.giftpkg_name;
            this.thumbnails = giftPkgInfo.thumbnails;
            this.acquire_num = giftPkgInfo.acquire_num;
            this.corner_mark = giftPkgInfo.corner_mark;
            this.button_text = giftPkgInfo.button_text;
            this.giftpkg_url = giftPkgInfo.giftpkg_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftPkgInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GiftPkgInfo(this, z, null) : (GiftPkgInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1231745199, "Ltbclient/GetGameDetailNew/GiftPkgInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1231745199, "Ltbclient/GetGameDetailNew/GiftPkgInfo;");
                return;
            }
        }
        DEFAULT_ACQUIRE_NUM = 0L;
    }

    public /* synthetic */ GiftPkgInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftPkgInfo(Builder builder, boolean z) {
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
            String str = builder.giftpkg_name;
            if (str == null) {
                this.giftpkg_name = "";
            } else {
                this.giftpkg_name = str;
            }
            String str2 = builder.thumbnails;
            if (str2 == null) {
                this.thumbnails = "";
            } else {
                this.thumbnails = str2;
            }
            Long l = builder.acquire_num;
            if (l == null) {
                this.acquire_num = DEFAULT_ACQUIRE_NUM;
            } else {
                this.acquire_num = l;
            }
            String str3 = builder.corner_mark;
            if (str3 == null) {
                this.corner_mark = "";
            } else {
                this.corner_mark = str3;
            }
            String str4 = builder.button_text;
            if (str4 == null) {
                this.button_text = "";
            } else {
                this.button_text = str4;
            }
            String str5 = builder.giftpkg_url;
            if (str5 == null) {
                this.giftpkg_url = "";
                return;
            } else {
                this.giftpkg_url = str5;
                return;
            }
        }
        this.giftpkg_name = builder.giftpkg_name;
        this.thumbnails = builder.thumbnails;
        this.acquire_num = builder.acquire_num;
        this.corner_mark = builder.corner_mark;
        this.button_text = builder.button_text;
        this.giftpkg_url = builder.giftpkg_url;
    }
}
