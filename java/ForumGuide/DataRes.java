package tbclient.ForumGuide;

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
import tbclient.ForumCreateInfo;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<HotSearch> DEFAULT_HOT_SEARCH;
    public static final Integer DEFAULT_IS_LOGIN;
    public static final List<LikeForum> DEFAULT_LIKE_FORUM;
    public static final Integer DEFAULT_MSIGN_LEVEL;
    public static final String DEFAULT_MSIGN_TEXT = "";
    public static final Integer DEFAULT_MSIGN_VALID;
    public static final List<ThreadInfo> DEFAULT_VOICE_ROOM_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3)
    public final ForumCreateInfo forum_create_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<HotSearch> hot_search;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_login;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<LikeForum> like_forum;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer msign_level;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String msign_text;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer msign_valid;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ThreadInfo> voice_room_list;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ForumCreateInfo forum_create_info;
        public List<HotSearch> hot_search;
        public Integer is_login;
        public List<LikeForum> like_forum;
        public Integer msign_level;
        public String msign_text;
        public Integer msign_valid;
        public List<ThreadInfo> voice_room_list;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.hot_search = Message.copyOf(dataRes.hot_search);
            this.like_forum = Message.copyOf(dataRes.like_forum);
            this.forum_create_info = dataRes.forum_create_info;
            this.is_login = dataRes.is_login;
            this.msign_valid = dataRes.msign_valid;
            this.msign_text = dataRes.msign_text;
            this.msign_level = dataRes.msign_level;
            this.voice_room_list = Message.copyOf(dataRes.voice_room_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataRes(this, z, null);
            }
            return (DataRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(935667343, "Ltbclient/ForumGuide/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(935667343, "Ltbclient/ForumGuide/DataRes;");
                return;
            }
        }
        DEFAULT_HOT_SEARCH = Collections.emptyList();
        DEFAULT_LIKE_FORUM = Collections.emptyList();
        DEFAULT_IS_LOGIN = 0;
        DEFAULT_MSIGN_VALID = 0;
        DEFAULT_MSIGN_LEVEL = 0;
        DEFAULT_VOICE_ROOM_LIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            List<HotSearch> list = builder.hot_search;
            if (list == null) {
                this.hot_search = DEFAULT_HOT_SEARCH;
            } else {
                this.hot_search = Message.immutableCopyOf(list);
            }
            List<LikeForum> list2 = builder.like_forum;
            if (list2 == null) {
                this.like_forum = DEFAULT_LIKE_FORUM;
            } else {
                this.like_forum = Message.immutableCopyOf(list2);
            }
            this.forum_create_info = builder.forum_create_info;
            Integer num = builder.is_login;
            if (num == null) {
                this.is_login = DEFAULT_IS_LOGIN;
            } else {
                this.is_login = num;
            }
            Integer num2 = builder.msign_valid;
            if (num2 == null) {
                this.msign_valid = DEFAULT_MSIGN_VALID;
            } else {
                this.msign_valid = num2;
            }
            String str = builder.msign_text;
            if (str == null) {
                this.msign_text = "";
            } else {
                this.msign_text = str;
            }
            Integer num3 = builder.msign_level;
            if (num3 == null) {
                this.msign_level = DEFAULT_MSIGN_LEVEL;
            } else {
                this.msign_level = num3;
            }
            List<ThreadInfo> list3 = builder.voice_room_list;
            if (list3 == null) {
                this.voice_room_list = DEFAULT_VOICE_ROOM_LIST;
                return;
            } else {
                this.voice_room_list = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.hot_search = Message.immutableCopyOf(builder.hot_search);
        this.like_forum = Message.immutableCopyOf(builder.like_forum);
        this.forum_create_info = builder.forum_create_info;
        this.is_login = builder.is_login;
        this.msign_valid = builder.msign_valid;
        this.msign_text = builder.msign_text;
        this.msign_level = builder.msign_level;
        this.voice_room_list = Message.immutableCopyOf(builder.voice_room_list);
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
