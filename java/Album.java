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
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class Album extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ALBUM_ID;
    public static final String DEFAULT_ALBUM_NAME = "";
    public static final List<ConcernUser> DEFAULT_CONCERN_USER;
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_DISTANCE;
    public static final Integer DEFAULT_END_TIME;
    public static final List<High> DEFAULT_HIGH;
    public static final String DEFAULT_LOCATION = "";
    public static final Integer DEFAULT_NUM_JOIN;
    public static final Integer DEFAULT_NUM_USER;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_START_TIME;
    public static final Long DEFAULT_UID;
    public static final String DEFAULT_USER_NAME = "";
    public static final Integer DEFAULT_WEIGHT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String album_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<ConcernUser> concern_user;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer distance;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<High> high;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String location;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num_join;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer num_user;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer start_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer weight;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<Album> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long album_id;
        public String album_name;
        public List<ConcernUser> concern_user;
        public Integer create_time;
        public Integer distance;
        public Integer end_time;
        public List<High> high;
        public String location;
        public Integer num_join;
        public Integer num_user;
        public String portrait;
        public Integer start_time;
        public Long uid;
        public String user_name;
        public Integer weight;

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
        public Builder(Album album) {
            super(album);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {album};
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
            if (album == null) {
                return;
            }
            this.album_id = album.album_id;
            this.uid = album.uid;
            this.create_time = album.create_time;
            this.start_time = album.start_time;
            this.end_time = album.end_time;
            this.num_join = album.num_join;
            this.weight = album.weight;
            this.album_name = album.album_name;
            this.location = album.location;
            this.distance = album.distance;
            this.high = Message.copyOf(album.high);
            this.concern_user = Message.copyOf(album.concern_user);
            this.num_user = album.num_user;
            this.user_name = album.user_name;
            this.portrait = album.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Album build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Album(this, z, null) : (Album) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(113611030, "Ltbclient/Album;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(113611030, "Ltbclient/Album;");
                return;
            }
        }
        DEFAULT_ALBUM_ID = 0L;
        DEFAULT_UID = 0L;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_START_TIME = 0;
        DEFAULT_END_TIME = 0;
        DEFAULT_NUM_JOIN = 0;
        DEFAULT_WEIGHT = 0;
        DEFAULT_DISTANCE = 0;
        DEFAULT_HIGH = Collections.emptyList();
        DEFAULT_CONCERN_USER = Collections.emptyList();
        DEFAULT_NUM_USER = 0;
    }

    public /* synthetic */ Album(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Album(Builder builder, boolean z) {
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
            Integer num4 = builder.num_join;
            if (num4 == null) {
                this.num_join = DEFAULT_NUM_JOIN;
            } else {
                this.num_join = num4;
            }
            Integer num5 = builder.weight;
            if (num5 == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = num5;
            }
            String str = builder.album_name;
            if (str == null) {
                this.album_name = "";
            } else {
                this.album_name = str;
            }
            String str2 = builder.location;
            if (str2 == null) {
                this.location = "";
            } else {
                this.location = str2;
            }
            Integer num6 = builder.distance;
            if (num6 == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = num6;
            }
            List<High> list = builder.high;
            if (list == null) {
                this.high = DEFAULT_HIGH;
            } else {
                this.high = Message.immutableCopyOf(list);
            }
            List<ConcernUser> list2 = builder.concern_user;
            if (list2 == null) {
                this.concern_user = DEFAULT_CONCERN_USER;
            } else {
                this.concern_user = Message.immutableCopyOf(list2);
            }
            Integer num7 = builder.num_user;
            if (num7 == null) {
                this.num_user = DEFAULT_NUM_USER;
            } else {
                this.num_user = num7;
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
                return;
            } else {
                this.portrait = str4;
                return;
            }
        }
        this.album_id = builder.album_id;
        this.uid = builder.uid;
        this.create_time = builder.create_time;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.num_join = builder.num_join;
        this.weight = builder.weight;
        this.album_name = builder.album_name;
        this.location = builder.location;
        this.distance = builder.distance;
        this.high = Message.immutableCopyOf(builder.high);
        this.concern_user = Message.immutableCopyOf(builder.concern_user);
        this.num_user = builder.num_user;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
    }
}
