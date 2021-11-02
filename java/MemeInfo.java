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
/* loaded from: classes3.dex */
public final class MemeInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_DETAIL_LINK = "";
    public static final Integer DEFAULT_HEIGHT;
    public static final Integer DEFAULT_PCK_ID;
    public static final Long DEFAULT_PIC_ID;
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_THUMBNAIL = "";
    public static final Integer DEFAULT_WIDTH;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String detail_link;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer pck_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long pic_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer width;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<MemeInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String detail_link;
        public Integer height;
        public Integer pck_id;
        public Long pic_id;
        public String pic_url;
        public String thumbnail;
        public Integer width;

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
        public Builder(MemeInfo memeInfo) {
            super(memeInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {memeInfo};
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
            if (memeInfo == null) {
                return;
            }
            this.pck_id = memeInfo.pck_id;
            this.pic_id = memeInfo.pic_id;
            this.pic_url = memeInfo.pic_url;
            this.thumbnail = memeInfo.thumbnail;
            this.width = memeInfo.width;
            this.height = memeInfo.height;
            this.detail_link = memeInfo.detail_link;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemeInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new MemeInfo(this, z, null) : (MemeInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1305491539, "Ltbclient/MemeInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1305491539, "Ltbclient/MemeInfo;");
                return;
            }
        }
        DEFAULT_PCK_ID = 0;
        DEFAULT_PIC_ID = 0L;
        DEFAULT_WIDTH = 0;
        DEFAULT_HEIGHT = 0;
    }

    public /* synthetic */ MemeInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeInfo(Builder builder, boolean z) {
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
            Integer num = builder.pck_id;
            if (num == null) {
                this.pck_id = DEFAULT_PCK_ID;
            } else {
                this.pck_id = num;
            }
            Long l = builder.pic_id;
            if (l == null) {
                this.pic_id = DEFAULT_PIC_ID;
            } else {
                this.pic_id = l;
            }
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            String str2 = builder.thumbnail;
            if (str2 == null) {
                this.thumbnail = "";
            } else {
                this.thumbnail = str2;
            }
            Integer num2 = builder.width;
            if (num2 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num2;
            }
            Integer num3 = builder.height;
            if (num3 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num3;
            }
            String str3 = builder.detail_link;
            if (str3 == null) {
                this.detail_link = "";
                return;
            } else {
                this.detail_link = str3;
                return;
            }
        }
        this.pck_id = builder.pck_id;
        this.pic_id = builder.pic_id;
        this.pic_url = builder.pic_url;
        this.thumbnail = builder.thumbnail;
        this.width = builder.width;
        this.height = builder.height;
        this.detail_link = builder.detail_link;
    }
}
