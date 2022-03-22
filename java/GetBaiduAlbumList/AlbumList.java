package tbclient.GetBaiduAlbumList;

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
/* loaded from: classes8.dex */
public final class AlbumList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ALBUM_ID = "";
    public static final String DEFAULT_ALBUM_NAME = "";
    public static final String DEFAULT_APP_ID = "";
    public static final String DEFAULT_COVER_PICTURE_URL = "";
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_IS_NETDISK;
    public static final Integer DEFAULT_IS_SYSTEM;
    public static final Integer DEFAULT_PICTURE_NUM;
    public static final Integer DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String album_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String album_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String app_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String cover_picture_url;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_netdisk;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_system;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer picture_num;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer update_time;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AlbumList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String album_id;
        public String album_name;
        public String app_id;
        public String cover_picture_url;
        public Integer create_time;
        public Integer is_netdisk;
        public Integer is_system;
        public Integer picture_num;
        public Integer update_time;

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
        public Builder(AlbumList albumList) {
            super(albumList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {albumList};
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
            if (albumList == null) {
                return;
            }
            this.album_id = albumList.album_id;
            this.album_name = albumList.album_name;
            this.picture_num = albumList.picture_num;
            this.cover_picture_url = albumList.cover_picture_url;
            this.app_id = albumList.app_id;
            this.is_system = albumList.is_system;
            this.create_time = albumList.create_time;
            this.update_time = albumList.update_time;
            this.is_netdisk = albumList.is_netdisk;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlbumList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AlbumList(this, z, null) : (AlbumList) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-407062561, "Ltbclient/GetBaiduAlbumList/AlbumList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-407062561, "Ltbclient/GetBaiduAlbumList/AlbumList;");
                return;
            }
        }
        DEFAULT_PICTURE_NUM = 0;
        DEFAULT_IS_SYSTEM = 0;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT_IS_NETDISK = 0;
    }

    public /* synthetic */ AlbumList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumList(Builder builder, boolean z) {
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
            String str = builder.album_id;
            if (str == null) {
                this.album_id = "";
            } else {
                this.album_id = str;
            }
            String str2 = builder.album_name;
            if (str2 == null) {
                this.album_name = "";
            } else {
                this.album_name = str2;
            }
            Integer num = builder.picture_num;
            if (num == null) {
                this.picture_num = DEFAULT_PICTURE_NUM;
            } else {
                this.picture_num = num;
            }
            String str3 = builder.cover_picture_url;
            if (str3 == null) {
                this.cover_picture_url = "";
            } else {
                this.cover_picture_url = str3;
            }
            String str4 = builder.app_id;
            if (str4 == null) {
                this.app_id = "";
            } else {
                this.app_id = str4;
            }
            Integer num2 = builder.is_system;
            if (num2 == null) {
                this.is_system = DEFAULT_IS_SYSTEM;
            } else {
                this.is_system = num2;
            }
            Integer num3 = builder.create_time;
            if (num3 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num3;
            }
            Integer num4 = builder.update_time;
            if (num4 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num4;
            }
            Integer num5 = builder.is_netdisk;
            if (num5 == null) {
                this.is_netdisk = DEFAULT_IS_NETDISK;
                return;
            } else {
                this.is_netdisk = num5;
                return;
            }
        }
        this.album_id = builder.album_id;
        this.album_name = builder.album_name;
        this.picture_num = builder.picture_num;
        this.cover_picture_url = builder.cover_picture_url;
        this.app_id = builder.app_id;
        this.is_system = builder.is_system;
        this.create_time = builder.create_time;
        this.update_time = builder.update_time;
        this.is_netdisk = builder.is_netdisk;
    }
}
