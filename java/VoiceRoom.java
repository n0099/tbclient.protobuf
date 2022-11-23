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
/* loaded from: classes9.dex */
public final class VoiceRoom extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_IS_SUBCRIBED;
    public static final Long DEFAULT_JOINED_NUM;
    public static final Long DEFAULT_LEFT_RESERVED_TIME;
    public static final Long DEFAULT_RESERVED_NUM;
    public static final Long DEFAULT_RESERVED_TIME;
    public static final Long DEFAULT_ROOM_ID;
    public static final String DEFAULT_ROOM_NAME = "";
    public static final Integer DEFAULT_STATUS;
    public static final List<User> DEFAULT_TALKER;
    public static final Long DEFAULT_TALKER_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)
    public final User author;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer is_subcribed;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long joined_num;
    @ProtoField(tag = 12, type = Message.Datatype.INT64)
    public final Long left_reserved_time;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long reserved_num;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long reserved_time;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long room_id;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String room_name;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<User> talker;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long talker_num;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VoiceRoom> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public User author;
        public Integer is_subcribed;
        public Long joined_num;
        public Long left_reserved_time;
        public Long reserved_num;
        public Long reserved_time;
        public Long room_id;
        public String room_name;
        public Integer status;
        public List<User> talker;
        public Long talker_num;

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
        public Builder(VoiceRoom voiceRoom) {
            super(voiceRoom);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {voiceRoom};
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
            if (voiceRoom == null) {
                return;
            }
            this.room_id = voiceRoom.room_id;
            this.author = voiceRoom.author;
            this.talker = Message.copyOf(voiceRoom.talker);
            this.joined_num = voiceRoom.joined_num;
            this.talker_num = voiceRoom.talker_num;
            this.status = voiceRoom.status;
            this.room_name = voiceRoom.room_name;
            this.reserved_num = voiceRoom.reserved_num;
            this.reserved_time = voiceRoom.reserved_time;
            this.left_reserved_time = voiceRoom.left_reserved_time;
            this.is_subcribed = voiceRoom.is_subcribed;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VoiceRoom build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new VoiceRoom(this, z, null);
            }
            return (VoiceRoom) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-228051688, "Ltbclient/VoiceRoom;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-228051688, "Ltbclient/VoiceRoom;");
                return;
            }
        }
        DEFAULT_ROOM_ID = 0L;
        DEFAULT_TALKER = Collections.emptyList();
        DEFAULT_JOINED_NUM = 0L;
        DEFAULT_TALKER_NUM = 0L;
        DEFAULT_STATUS = 0;
        DEFAULT_RESERVED_NUM = 0L;
        DEFAULT_RESERVED_TIME = 0L;
        DEFAULT_LEFT_RESERVED_TIME = 0L;
        DEFAULT_IS_SUBCRIBED = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceRoom(Builder builder, boolean z) {
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
            Long l = builder.room_id;
            if (l == null) {
                this.room_id = DEFAULT_ROOM_ID;
            } else {
                this.room_id = l;
            }
            this.author = builder.author;
            List<User> list = builder.talker;
            if (list == null) {
                this.talker = DEFAULT_TALKER;
            } else {
                this.talker = Message.immutableCopyOf(list);
            }
            Long l2 = builder.joined_num;
            if (l2 == null) {
                this.joined_num = DEFAULT_JOINED_NUM;
            } else {
                this.joined_num = l2;
            }
            Long l3 = builder.talker_num;
            if (l3 == null) {
                this.talker_num = DEFAULT_TALKER_NUM;
            } else {
                this.talker_num = l3;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            String str = builder.room_name;
            if (str == null) {
                this.room_name = "";
            } else {
                this.room_name = str;
            }
            Long l4 = builder.reserved_num;
            if (l4 == null) {
                this.reserved_num = DEFAULT_RESERVED_NUM;
            } else {
                this.reserved_num = l4;
            }
            Long l5 = builder.reserved_time;
            if (l5 == null) {
                this.reserved_time = DEFAULT_RESERVED_TIME;
            } else {
                this.reserved_time = l5;
            }
            Long l6 = builder.left_reserved_time;
            if (l6 == null) {
                this.left_reserved_time = DEFAULT_LEFT_RESERVED_TIME;
            } else {
                this.left_reserved_time = l6;
            }
            Integer num2 = builder.is_subcribed;
            if (num2 == null) {
                this.is_subcribed = DEFAULT_IS_SUBCRIBED;
                return;
            } else {
                this.is_subcribed = num2;
                return;
            }
        }
        this.room_id = builder.room_id;
        this.author = builder.author;
        this.talker = Message.immutableCopyOf(builder.talker);
        this.joined_num = builder.joined_num;
        this.talker_num = builder.talker_num;
        this.status = builder.status;
        this.room_name = builder.room_name;
        this.reserved_num = builder.reserved_num;
        this.reserved_time = builder.reserved_time;
        this.left_reserved_time = builder.left_reserved_time;
        this.is_subcribed = builder.is_subcribed;
    }

    public /* synthetic */ VoiceRoom(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
