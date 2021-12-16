package tbclient.UnreadTip;

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
/* loaded from: classes5.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_HIDE_UNIX;
    public static final List<String> DEFAULT_PORTRAIT_LIST;
    public static final String DEFAULT_SHOW_TIP = "";
    public static final Integer DEFAULT_THREAD_COUNT;
    public static final Integer DEFAULT_USER_COUNT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long hide_unix;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> portrait_list;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String show_tip;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer thread_count;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer user_count;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long hide_unix;
        public List<String> portrait_list;
        public String show_tip;
        public Integer thread_count;
        public Integer user_count;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.user_count = dataRes.user_count;
            this.portrait_list = Message.copyOf(dataRes.portrait_list);
            this.hide_unix = dataRes.hide_unix;
            this.show_tip = dataRes.show_tip;
            this.thread_count = dataRes.thread_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-248280782, "Ltbclient/UnreadTip/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-248280782, "Ltbclient/UnreadTip/DataRes;");
                return;
            }
        }
        DEFAULT_USER_COUNT = 0;
        DEFAULT_PORTRAIT_LIST = Collections.emptyList();
        DEFAULT_HIDE_UNIX = 0L;
        DEFAULT_THREAD_COUNT = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
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
            Integer num = builder.user_count;
            if (num == null) {
                this.user_count = DEFAULT_USER_COUNT;
            } else {
                this.user_count = num;
            }
            List<String> list = builder.portrait_list;
            if (list == null) {
                this.portrait_list = DEFAULT_PORTRAIT_LIST;
            } else {
                this.portrait_list = Message.immutableCopyOf(list);
            }
            Long l = builder.hide_unix;
            if (l == null) {
                this.hide_unix = DEFAULT_HIDE_UNIX;
            } else {
                this.hide_unix = l;
            }
            String str = builder.show_tip;
            if (str == null) {
                this.show_tip = "";
            } else {
                this.show_tip = str;
            }
            Integer num2 = builder.thread_count;
            if (num2 == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
                return;
            } else {
                this.thread_count = num2;
                return;
            }
        }
        this.user_count = builder.user_count;
        this.portrait_list = Message.immutableCopyOf(builder.portrait_list);
        this.hide_unix = builder.hide_unix;
        this.show_tip = builder.show_tip;
        this.thread_count = builder.thread_count;
    }
}
