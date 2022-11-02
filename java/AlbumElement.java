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
public final class AlbumElement extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ALBUM_HEIGHT;
    public static final String DEFAULT_ALBUM_THUMB_URL = "";
    public static final Integer DEFAULT_ALBUM_TYPE;
    public static final String DEFAULT_ALBUM_URL = "";
    public static final Integer DEFAULT_ALBUM_WIDTH;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer album_height;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String album_thumb_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer album_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String album_url;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer album_width;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AlbumElement> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer album_height;
        public String album_thumb_url;
        public Integer album_type;
        public String album_url;
        public Integer album_width;

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
        public Builder(AlbumElement albumElement) {
            super(albumElement);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {albumElement};
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
            if (albumElement == null) {
                return;
            }
            this.album_type = albumElement.album_type;
            this.album_url = albumElement.album_url;
            this.album_thumb_url = albumElement.album_thumb_url;
            this.album_height = albumElement.album_height;
            this.album_width = albumElement.album_width;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlbumElement build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new AlbumElement(this, z, null);
            }
            return (AlbumElement) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1272248228, "Ltbclient/AlbumElement;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1272248228, "Ltbclient/AlbumElement;");
                return;
            }
        }
        DEFAULT_ALBUM_TYPE = 0;
        DEFAULT_ALBUM_HEIGHT = 0;
        DEFAULT_ALBUM_WIDTH = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumElement(Builder builder, boolean z) {
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
            Integer num = builder.album_type;
            if (num == null) {
                this.album_type = DEFAULT_ALBUM_TYPE;
            } else {
                this.album_type = num;
            }
            String str = builder.album_url;
            if (str == null) {
                this.album_url = "";
            } else {
                this.album_url = str;
            }
            String str2 = builder.album_thumb_url;
            if (str2 == null) {
                this.album_thumb_url = "";
            } else {
                this.album_thumb_url = str2;
            }
            Integer num2 = builder.album_height;
            if (num2 == null) {
                this.album_height = DEFAULT_ALBUM_HEIGHT;
            } else {
                this.album_height = num2;
            }
            Integer num3 = builder.album_width;
            if (num3 == null) {
                this.album_width = DEFAULT_ALBUM_WIDTH;
                return;
            } else {
                this.album_width = num3;
                return;
            }
        }
        this.album_type = builder.album_type;
        this.album_url = builder.album_url;
        this.album_thumb_url = builder.album_thumb_url;
        this.album_height = builder.album_height;
        this.album_width = builder.album_width;
    }

    public /* synthetic */ AlbumElement(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
