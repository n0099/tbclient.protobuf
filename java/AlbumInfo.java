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
public final class AlbumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ALBUM_ID;
    public static final String DEFAULT_ALBUM_NAME = "";
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_END_TIME;
    public static final Boolean DEFAULT_HAS_COLLECT;
    public static final Double DEFAULT_LATD;
    public static final String DEFAULT_LOCATION = "";
    public static final Double DEFAULT_LONGTD;
    public static final Integer DEFAULT_NUM_HIGH;
    public static final Integer DEFAULT_NUM_JOIN;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_START_TIME;
    public static final Long DEFAULT_UID;
    public static final Integer DEFAULT_UPDATE_TIME;
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String album_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 15, type = Message.Datatype.BOOL)
    public final Boolean has_collect;
    @ProtoField(tag = 12, type = Message.Datatype.DOUBLE)
    public final Double latd;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 11, type = Message.Datatype.DOUBLE)
    public final Double longtd;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer num_high;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer num_join;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer start_time;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer update_time;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AlbumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long album_id;
        public String album_name;
        public Integer create_time;
        public Integer end_time;
        public Boolean has_collect;
        public Double latd;
        public String location;
        public Double longtd;
        public Integer num_high;
        public Integer num_join;
        public String portrait;
        public Integer start_time;
        public Long uid;
        public Integer update_time;
        public String user_name;

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
        public Builder(AlbumInfo albumInfo) {
            super(albumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {albumInfo};
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
            if (albumInfo == null) {
                return;
            }
            this.album_id = albumInfo.album_id;
            this.album_name = albumInfo.album_name;
            this.uid = albumInfo.uid;
            this.create_time = albumInfo.create_time;
            this.start_time = albumInfo.start_time;
            this.end_time = albumInfo.end_time;
            this.update_time = albumInfo.update_time;
            this.num_join = albumInfo.num_join;
            this.num_high = albumInfo.num_high;
            this.location = albumInfo.location;
            this.longtd = albumInfo.longtd;
            this.latd = albumInfo.latd;
            this.user_name = albumInfo.user_name;
            this.portrait = albumInfo.portrait;
            this.has_collect = albumInfo.has_collect;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlbumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AlbumInfo(this, z, null) : (AlbumInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(432270472, "Ltbclient/AlbumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(432270472, "Ltbclient/AlbumInfo;");
                return;
            }
        }
        DEFAULT_ALBUM_ID = 0L;
        DEFAULT_UID = 0L;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_START_TIME = 0;
        DEFAULT_END_TIME = 0;
        DEFAULT_UPDATE_TIME = 0;
        DEFAULT_NUM_JOIN = 0;
        DEFAULT_NUM_HIGH = 0;
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_LONGTD = valueOf;
        DEFAULT_LATD = valueOf;
        DEFAULT_HAS_COLLECT = Boolean.FALSE;
    }

    public /* synthetic */ AlbumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumInfo(Builder builder, boolean z) {
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
            Long l = builder.album_id;
            if (l == null) {
                this.album_id = DEFAULT_ALBUM_ID;
            } else {
                this.album_id = l;
            }
            String str = builder.album_name;
            if (str == null) {
                this.album_name = "";
            } else {
                this.album_name = str;
            }
            Long l2 = builder.uid;
            if (l2 == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l2;
            }
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            Integer num2 = builder.start_time;
            if (num2 == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num2;
            }
            Integer num3 = builder.end_time;
            if (num3 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num3;
            }
            Integer num4 = builder.update_time;
            if (num4 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num4;
            }
            Integer num5 = builder.num_join;
            if (num5 == null) {
                this.num_join = DEFAULT_NUM_JOIN;
            } else {
                this.num_join = num5;
            }
            Integer num6 = builder.num_high;
            if (num6 == null) {
                this.num_high = DEFAULT_NUM_HIGH;
            } else {
                this.num_high = num6;
            }
            String str2 = builder.location;
            if (str2 == null) {
                this.location = "";
            } else {
                this.location = str2;
            }
            Double d2 = builder.longtd;
            if (d2 == null) {
                this.longtd = DEFAULT_LONGTD;
            } else {
                this.longtd = d2;
            }
            Double d3 = builder.latd;
            if (d3 == null) {
                this.latd = DEFAULT_LATD;
            } else {
                this.latd = d3;
            }
            String str3 = builder.user_name;
            if (str3 == null) {
                this.user_name = "";
            } else {
                this.user_name = str3;
            }
            String str4 = builder.portrait;
            if (str4 == null) {
                this.portrait = "";
            } else {
                this.portrait = str4;
            }
            Boolean bool = builder.has_collect;
            if (bool == null) {
                this.has_collect = DEFAULT_HAS_COLLECT;
                return;
            } else {
                this.has_collect = bool;
                return;
            }
        }
        this.album_id = builder.album_id;
        this.album_name = builder.album_name;
        this.uid = builder.uid;
        this.create_time = builder.create_time;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.update_time = builder.update_time;
        this.num_join = builder.num_join;
        this.num_high = builder.num_high;
        this.location = builder.location;
        this.longtd = builder.longtd;
        this.latd = builder.latd;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.has_collect = builder.has_collect;
    }
}
