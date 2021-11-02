package tbclient.LiveSquare;

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
import tbclient.ThreadInfo;
/* loaded from: classes3.dex */
public final class HeadLiveInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BITMAP_WH_RATIO = "";
    public static final List<ThreadInfo> DEFAULT_HEAD_LIVE;
    public static final List<String> DEFAULT_HEAD_PIC;
    public static final Integer DEFAULT_IS_SET;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bitmap_wh_ratio;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> head_live;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> head_pic;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_set;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<HeadLiveInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String bitmap_wh_ratio;
        public List<ThreadInfo> head_live;
        public List<String> head_pic;
        public Integer is_set;

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
        public Builder(HeadLiveInfo headLiveInfo) {
            super(headLiveInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {headLiveInfo};
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
            if (headLiveInfo == null) {
                return;
            }
            this.head_live = Message.copyOf(headLiveInfo.head_live);
            this.head_pic = Message.copyOf(headLiveInfo.head_pic);
            this.bitmap_wh_ratio = headLiveInfo.bitmap_wh_ratio;
            this.is_set = headLiveInfo.is_set;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadLiveInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HeadLiveInfo(this, z, null) : (HeadLiveInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-464209371, "Ltbclient/LiveSquare/HeadLiveInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-464209371, "Ltbclient/LiveSquare/HeadLiveInfo;");
                return;
            }
        }
        DEFAULT_HEAD_LIVE = Collections.emptyList();
        DEFAULT_HEAD_PIC = Collections.emptyList();
        DEFAULT_IS_SET = 0;
    }

    public /* synthetic */ HeadLiveInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadLiveInfo(Builder builder, boolean z) {
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
            List<ThreadInfo> list = builder.head_live;
            if (list == null) {
                this.head_live = DEFAULT_HEAD_LIVE;
            } else {
                this.head_live = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.head_pic;
            if (list2 == null) {
                this.head_pic = DEFAULT_HEAD_PIC;
            } else {
                this.head_pic = Message.immutableCopyOf(list2);
            }
            String str = builder.bitmap_wh_ratio;
            if (str == null) {
                this.bitmap_wh_ratio = "";
            } else {
                this.bitmap_wh_ratio = str;
            }
            Integer num = builder.is_set;
            if (num == null) {
                this.is_set = DEFAULT_IS_SET;
                return;
            } else {
                this.is_set = num;
                return;
            }
        }
        this.head_live = Message.immutableCopyOf(builder.head_live);
        this.head_pic = Message.immutableCopyOf(builder.head_pic);
        this.bitmap_wh_ratio = builder.bitmap_wh_ratio;
        this.is_set = builder.is_set;
    }
}
