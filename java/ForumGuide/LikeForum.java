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
import tbclient.ThemeColorInfo;
/* loaded from: classes9.dex */
public final class LikeForum extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_HOT_NUM;
    public static final Integer DEFAULT_IS_SIGN;
    public static final Integer DEFAULT_LEVEL_ID;
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final Integer DEFAULT_MEMBER_COUNT;
    public static final Boolean DEFAULT_NEED_TRANS;
    public static final Long DEFAULT_SORT_VALUE;
    public static final Integer DEFAULT_THREAD_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer hot_num;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_sign;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String level_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 9, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long sort_value;
    @ProtoField(tag = 8)
    public final ThemeColorInfo theme_color;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer thread_num;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LikeForum> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer hot_num;
        public Integer is_sign;
        public Integer level_id;
        public String level_name;
        public Integer member_count;
        public Boolean need_trans;
        public Long sort_value;
        public ThemeColorInfo theme_color;
        public Integer thread_num;

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
        public Builder(LikeForum likeForum) {
            super(likeForum);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {likeForum};
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
            if (likeForum == null) {
                return;
            }
            this.forum_id = likeForum.forum_id;
            this.forum_name = likeForum.forum_name;
            this.avatar = likeForum.avatar;
            this.hot_num = likeForum.hot_num;
            this.member_count = likeForum.member_count;
            this.thread_num = likeForum.thread_num;
            this.sort_value = likeForum.sort_value;
            this.theme_color = likeForum.theme_color;
            this.need_trans = likeForum.need_trans;
            this.level_id = likeForum.level_id;
            this.level_name = likeForum.level_name;
            this.is_sign = likeForum.is_sign;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeForum build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LikeForum(this, z, null);
            }
            return (LikeForum) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1203351717, "Ltbclient/ForumGuide/LikeForum;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1203351717, "Ltbclient/ForumGuide/LikeForum;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_HOT_NUM = 0;
        DEFAULT_MEMBER_COUNT = 0;
        DEFAULT_THREAD_NUM = 0;
        DEFAULT_SORT_VALUE = 0L;
        DEFAULT_NEED_TRANS = Boolean.FALSE;
        DEFAULT_LEVEL_ID = 0;
        DEFAULT_IS_SIGN = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LikeForum(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.hot_num;
            if (num == null) {
                this.hot_num = DEFAULT_HOT_NUM;
            } else {
                this.hot_num = num;
            }
            Integer num2 = builder.member_count;
            if (num2 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num2;
            }
            Integer num3 = builder.thread_num;
            if (num3 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num3;
            }
            Long l2 = builder.sort_value;
            if (l2 == null) {
                this.sort_value = DEFAULT_SORT_VALUE;
            } else {
                this.sort_value = l2;
            }
            this.theme_color = builder.theme_color;
            Boolean bool = builder.need_trans;
            if (bool == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
            } else {
                this.need_trans = bool;
            }
            Integer num4 = builder.level_id;
            if (num4 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num4;
            }
            String str3 = builder.level_name;
            if (str3 == null) {
                this.level_name = "";
            } else {
                this.level_name = str3;
            }
            Integer num5 = builder.is_sign;
            if (num5 == null) {
                this.is_sign = DEFAULT_IS_SIGN;
                return;
            } else {
                this.is_sign = num5;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.hot_num = builder.hot_num;
        this.member_count = builder.member_count;
        this.thread_num = builder.thread_num;
        this.sort_value = builder.sort_value;
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
        this.level_id = builder.level_id;
        this.level_name = builder.level_name;
        this.is_sign = builder.is_sign;
    }

    public /* synthetic */ LikeForum(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
