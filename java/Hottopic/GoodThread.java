package tbclient.Hottopic;

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
public final class GoodThread extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final Long DEFAULT_FID;
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_HEAD_PIC = "";
    public static final Long DEFAULT_POST_ID;
    public static final Long DEFAULT_REPLY_NUM;
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_TITLE = "";
    public static final Long DEFAULT_ZAN_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long fid;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String head_pic;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long reply_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long zan_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GoodThread> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public Long fid;
        public String fname;
        public String head_pic;
        public Long post_id;
        public Long reply_num;
        public Long tid;
        public String title;
        public Long zan_num;

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
        public Builder(GoodThread goodThread) {
            super(goodThread);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {goodThread};
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
            if (goodThread == null) {
                return;
            }
            this.tid = goodThread.tid;
            this.title = goodThread.title;
            this.reply_num = goodThread.reply_num;
            this._abstract = goodThread._abstract;
            this.zan_num = goodThread.zan_num;
            this.fname = goodThread.fname;
            this.fid = goodThread.fid;
            this.post_id = goodThread.post_id;
            this.head_pic = goodThread.head_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GoodThread build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GoodThread(this, z, null) : (GoodThread) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1514462769, "Ltbclient/Hottopic/GoodThread;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1514462769, "Ltbclient/Hottopic/GoodThread;");
                return;
            }
        }
        DEFAULT_TID = 0L;
        DEFAULT_REPLY_NUM = 0L;
        DEFAULT_ZAN_NUM = 0L;
        DEFAULT_FID = 0L;
        DEFAULT_POST_ID = 0L;
    }

    public /* synthetic */ GoodThread(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoodThread(Builder builder, boolean z) {
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
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Long l2 = builder.reply_num;
            if (l2 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = l2;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            Long l3 = builder.zan_num;
            if (l3 == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = l3;
            }
            String str3 = builder.fname;
            if (str3 == null) {
                this.fname = "";
            } else {
                this.fname = str3;
            }
            Long l4 = builder.fid;
            if (l4 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l4;
            }
            Long l5 = builder.post_id;
            if (l5 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l5;
            }
            String str4 = builder.head_pic;
            if (str4 == null) {
                this.head_pic = "";
                return;
            } else {
                this.head_pic = str4;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.reply_num = builder.reply_num;
        this._abstract = builder._abstract;
        this.zan_num = builder.zan_num;
        this.fname = builder.fname;
        this.fid = builder.fid;
        this.post_id = builder.post_id;
        this.head_pic = builder.head_pic;
    }
}
