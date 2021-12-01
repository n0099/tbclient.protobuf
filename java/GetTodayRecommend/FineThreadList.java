package tbclient.GetTodayRecommend;

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
/* loaded from: classes4.dex */
public final class FineThreadList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final Long DEFAULT_FROMFID;
    public static final String DEFAULT_FROMFNAME = "";
    public static final Long DEFAULT_FTID;
    public static final List<String> DEFAULT_PICS;
    public static final Integer DEFAULT_PUBLISH_TIME;
    public static final Long DEFAULT_REPLY_NUM;
    public static final Integer DEFAULT_THREAD_TYPE;
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public static final Long DEFAULT_ZAN_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long fromfid;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String fromfname;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ftid;
    @ProtoField(label = Message.Label.REPEATED, tag = 12, type = Message.Datatype.STRING)
    public final List<String> pics;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long reply_num;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer thread_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long zan_num;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<FineThreadList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public Long fromfid;
        public String fromfname;
        public Long ftid;
        public List<String> pics;
        public Integer publish_time;
        public Long reply_num;
        public Integer thread_type;
        public Long tid;
        public String title;
        public Integer type;
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
        public Builder(FineThreadList fineThreadList) {
            super(fineThreadList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {fineThreadList};
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
            if (fineThreadList == null) {
                return;
            }
            this.ftid = fineThreadList.ftid;
            this.tid = fineThreadList.tid;
            this.title = fineThreadList.title;
            this.type = fineThreadList.type;
            this._abstract = fineThreadList._abstract;
            this.publish_time = fineThreadList.publish_time;
            this.zan_num = fineThreadList.zan_num;
            this.reply_num = fineThreadList.reply_num;
            this.fromfname = fineThreadList.fromfname;
            this.fromfid = fineThreadList.fromfid;
            this.thread_type = fineThreadList.thread_type;
            this.pics = Message.copyOf(fineThreadList.pics);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineThreadList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FineThreadList(this, z, null) : (FineThreadList) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-222303503, "Ltbclient/GetTodayRecommend/FineThreadList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-222303503, "Ltbclient/GetTodayRecommend/FineThreadList;");
                return;
            }
        }
        DEFAULT_FTID = 0L;
        DEFAULT_TID = 0L;
        DEFAULT_TYPE = 0;
        DEFAULT_PUBLISH_TIME = 0;
        DEFAULT_ZAN_NUM = 0L;
        DEFAULT_REPLY_NUM = 0L;
        DEFAULT_FROMFID = 0L;
        DEFAULT_THREAD_TYPE = 0;
        DEFAULT_PICS = Collections.emptyList();
    }

    public /* synthetic */ FineThreadList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FineThreadList(Builder builder, boolean z) {
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
            Long l = builder.ftid;
            if (l == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = l;
            }
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            Integer num2 = builder.publish_time;
            if (num2 == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = num2;
            }
            Long l3 = builder.zan_num;
            if (l3 == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = l3;
            }
            Long l4 = builder.reply_num;
            if (l4 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = l4;
            }
            String str3 = builder.fromfname;
            if (str3 == null) {
                this.fromfname = "";
            } else {
                this.fromfname = str3;
            }
            Long l5 = builder.fromfid;
            if (l5 == null) {
                this.fromfid = DEFAULT_FROMFID;
            } else {
                this.fromfid = l5;
            }
            Integer num3 = builder.thread_type;
            if (num3 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num3;
            }
            List<String> list = builder.pics;
            if (list == null) {
                this.pics = DEFAULT_PICS;
                return;
            } else {
                this.pics = Message.immutableCopyOf(list);
                return;
            }
        }
        this.ftid = builder.ftid;
        this.tid = builder.tid;
        this.title = builder.title;
        this.type = builder.type;
        this._abstract = builder._abstract;
        this.publish_time = builder.publish_time;
        this.zan_num = builder.zan_num;
        this.reply_num = builder.reply_num;
        this.fromfname = builder.fromfname;
        this.fromfid = builder.fromfid;
        this.thread_type = builder.thread_type;
        this.pics = Message.immutableCopyOf(builder.pics);
    }
}
