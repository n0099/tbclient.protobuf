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
/* loaded from: classes4.dex */
public final class GraffitiRankListInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<User> DEFAULT_CONSENT_LIST;
    public static final Integer DEFAULT_HAS_MORE;
    public static final Integer DEFAULT_HAS_STATE;
    public static final List<GraffitiRankItem> DEFAULT_LIST;
    public static final Integer DEFAULT_QUICK_LIST_COUNT;
    public static final Integer DEFAULT_SHOW_LIST_COUNT;
    public static final Long DEFAULT_TID;
    public static final Integer DEFAULT_TOTAL;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<User> consent_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_state;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<GraffitiRankItem> list;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer quick_list_count;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer show_list_count;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer total;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<GraffitiRankListInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<User> consent_list;
        public Integer has_more;
        public Integer has_state;
        public List<GraffitiRankItem> list;
        public Integer quick_list_count;
        public Integer show_list_count;
        public Long tid;
        public Integer total;

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
        public Builder(GraffitiRankListInfo graffitiRankListInfo) {
            super(graffitiRankListInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {graffitiRankListInfo};
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
            if (graffitiRankListInfo == null) {
                return;
            }
            this.has_more = graffitiRankListInfo.has_more;
            this.total = graffitiRankListInfo.total;
            this.list = Message.copyOf(graffitiRankListInfo.list);
            this.show_list_count = graffitiRankListInfo.show_list_count;
            this.quick_list_count = graffitiRankListInfo.quick_list_count;
            this.has_state = graffitiRankListInfo.has_state;
            this.tid = graffitiRankListInfo.tid;
            this.consent_list = Message.copyOf(graffitiRankListInfo.consent_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GraffitiRankListInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GraffitiRankListInfo(this, z, null) : (GraffitiRankListInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1603247631, "Ltbclient/GraffitiRankListInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1603247631, "Ltbclient/GraffitiRankListInfo;");
                return;
            }
        }
        DEFAULT_HAS_MORE = 0;
        DEFAULT_TOTAL = 0;
        DEFAULT_LIST = Collections.emptyList();
        DEFAULT_SHOW_LIST_COUNT = 0;
        DEFAULT_QUICK_LIST_COUNT = 0;
        DEFAULT_HAS_STATE = 0;
        DEFAULT_TID = 0L;
        DEFAULT_CONSENT_LIST = Collections.emptyList();
    }

    public /* synthetic */ GraffitiRankListInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraffitiRankListInfo(Builder builder, boolean z) {
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
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            Integer num2 = builder.total;
            if (num2 == null) {
                this.total = DEFAULT_TOTAL;
            } else {
                this.total = num2;
            }
            List<GraffitiRankItem> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            Integer num3 = builder.show_list_count;
            if (num3 == null) {
                this.show_list_count = DEFAULT_SHOW_LIST_COUNT;
            } else {
                this.show_list_count = num3;
            }
            Integer num4 = builder.quick_list_count;
            if (num4 == null) {
                this.quick_list_count = DEFAULT_QUICK_LIST_COUNT;
            } else {
                this.quick_list_count = num4;
            }
            Integer num5 = builder.has_state;
            if (num5 == null) {
                this.has_state = DEFAULT_HAS_STATE;
            } else {
                this.has_state = num5;
            }
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            List<User> list2 = builder.consent_list;
            if (list2 == null) {
                this.consent_list = DEFAULT_CONSENT_LIST;
                return;
            } else {
                this.consent_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.has_more = builder.has_more;
        this.total = builder.total;
        this.list = Message.immutableCopyOf(builder.list);
        this.show_list_count = builder.show_list_count;
        this.quick_list_count = builder.quick_list_count;
        this.has_state = builder.has_state;
        this.tid = builder.tid;
        this.consent_list = Message.immutableCopyOf(builder.consent_list);
    }
}
