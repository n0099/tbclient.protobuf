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
public final class Myrecord extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_AGREE_NUM;
    public static final String DEFAULT_APPLY_DECLARATION = "";
    public static final Integer DEFAULT_APPLY_ID;
    public static final Integer DEFAULT_FORUM_LEVEL;
    public static final String DEFAULT_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_POST_NUM;
    public static final Integer DEFAULT_RANK;
    public static final Integer DEFAULT_THREAD_NUM;
    public static final Long DEFAULT_TID;
    public static final Long DEFAULT_UID;
    public static final Integer DEFAULT_VOTE_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer agree_num;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String apply_declaration;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer apply_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer forum_level;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String name_show;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer rank;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer thread_num;
    @ProtoField(tag = 12, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer vote_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Myrecord> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer agree_num;
        public String apply_declaration;
        public Integer apply_id;
        public Integer forum_level;
        public String name_show;
        public String portrait;
        public Integer post_num;
        public Integer rank;
        public Integer thread_num;
        public Long tid;
        public Long uid;
        public Integer vote_num;

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
        public Builder(Myrecord myrecord) {
            super(myrecord);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {myrecord};
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
            if (myrecord == null) {
                return;
            }
            this.apply_id = myrecord.apply_id;
            this.uid = myrecord.uid;
            this.rank = myrecord.rank;
            this.portrait = myrecord.portrait;
            this.name_show = myrecord.name_show;
            this.forum_level = myrecord.forum_level;
            this.vote_num = myrecord.vote_num;
            this.agree_num = myrecord.agree_num;
            this.thread_num = myrecord.thread_num;
            this.post_num = myrecord.post_num;
            this.apply_declaration = myrecord.apply_declaration;
            this.tid = myrecord.tid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Myrecord build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Myrecord(this, z, null) : (Myrecord) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1968563508, "Ltbclient/Myrecord;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1968563508, "Ltbclient/Myrecord;");
                return;
            }
        }
        DEFAULT_APPLY_ID = 0;
        DEFAULT_UID = 0L;
        DEFAULT_RANK = 0;
        DEFAULT_FORUM_LEVEL = 0;
        DEFAULT_VOTE_NUM = 0;
        DEFAULT_AGREE_NUM = 0;
        DEFAULT_THREAD_NUM = 0;
        DEFAULT_POST_NUM = 0;
        DEFAULT_TID = 0L;
    }

    public /* synthetic */ Myrecord(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Myrecord(Builder builder, boolean z) {
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
            Integer num = builder.apply_id;
            if (num == null) {
                this.apply_id = DEFAULT_APPLY_ID;
            } else {
                this.apply_id = num;
            }
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            Integer num2 = builder.rank;
            if (num2 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = num2;
            }
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.name_show;
            if (str2 == null) {
                this.name_show = "";
            } else {
                this.name_show = str2;
            }
            Integer num3 = builder.forum_level;
            if (num3 == null) {
                this.forum_level = DEFAULT_FORUM_LEVEL;
            } else {
                this.forum_level = num3;
            }
            Integer num4 = builder.vote_num;
            if (num4 == null) {
                this.vote_num = DEFAULT_VOTE_NUM;
            } else {
                this.vote_num = num4;
            }
            Integer num5 = builder.agree_num;
            if (num5 == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = num5;
            }
            Integer num6 = builder.thread_num;
            if (num6 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num6;
            }
            Integer num7 = builder.post_num;
            if (num7 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num7;
            }
            String str3 = builder.apply_declaration;
            if (str3 == null) {
                this.apply_declaration = "";
            } else {
                this.apply_declaration = str3;
            }
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
                return;
            } else {
                this.tid = l2;
                return;
            }
        }
        this.apply_id = builder.apply_id;
        this.uid = builder.uid;
        this.rank = builder.rank;
        this.portrait = builder.portrait;
        this.name_show = builder.name_show;
        this.forum_level = builder.forum_level;
        this.vote_num = builder.vote_num;
        this.agree_num = builder.agree_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.apply_declaration = builder.apply_declaration;
        this.tid = builder.tid;
    }
}
